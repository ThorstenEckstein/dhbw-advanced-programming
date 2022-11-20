package de.dhbw.course12;

import static de.dhbw.course12.printsupport.print.PrinterFactory.PrinterType.STRING;
import static de.dhbw.course12.printsupport.print.PrinterFactory.PrinterType.XML;

import de.dhbw.course12.adapter.LocalMapRenderEngine;
import de.dhbw.course12.adapter.LocalRenderEngine;
import de.dhbw.course12.adapter.ProprietaryRenderEngine;
import de.dhbw.course12.adapter.RenderProcessor;
import de.dhbw.course12.decorator.example1.DefaultRenderer;
import de.dhbw.course12.decorator.example1.RenderAndPrintDecorator;
import de.dhbw.course12.decorator.example1.Renderer;
import de.dhbw.course12.decorator.example2.commands.Command;
import de.dhbw.course12.decorator.example2.commands.CreateCommand;
import de.dhbw.course12.decorator.example2.commands.UpdateCommand;
import de.dhbw.course12.decorator.example2.decorator.CommandDecorator;
import de.dhbw.course12.decorator.example2.decorator.CreateCommandDecorator;
import de.dhbw.course12.decorator.example2.decorator.UpdateCommandDecorator;
import de.dhbw.course12.filter.v1.FilterChain;
import de.dhbw.course12.filter.v1.FilterException;
import de.dhbw.course12.filter.v1.impl.EqualityFilter;
import de.dhbw.course12.filter.v1.impl.IdentityFilter;
import de.dhbw.course12.filter.v1.impl.SynonymityFilter;
import de.dhbw.course12.filter.v1.mock.Input;
import de.dhbw.course12.filter.v1.mock.Output;
import de.dhbw.course12.observer.MapObserver;
import de.dhbw.course12.observer.Observable;
import de.dhbw.course12.observer.ObservableMap;
import de.dhbw.course12.observer.Observer;
import de.dhbw.course12.printsupport.model.A;
import de.dhbw.course12.printsupport.model.B;
import de.dhbw.course12.printsupport.model.C;
import de.dhbw.course12.printsupport.print.PrinterFactory.PrinterType;
import de.dhbw.course12.proxy.RenderEngine;
import de.dhbw.course12.proxy.RenderEngineProxy;
import de.dhbw.course12.proxy.RenderException;
import de.dhbw.course12.template.AbstractBusinessService;
import de.dhbw.course12.template.MyBusinessService;

import static de.dhbw.course12.Assertions.*;

public class PatternTest {

	public void structure_decorator_example1() {
		// arrange: create default
		Renderer defaultRenderer = new DefaultRenderer();
		// ... now decorate the default
		Renderer decoratedRenderer = new RenderAndPrintDecorator(
				new DefaultRenderer());
	
		// act
		String actualDefault = defaultRenderer.render();
		String actualDecorated = decoratedRenderer.render();
	
		// assert
		assertEquals("Default way of rendering", "doing default rendering ...",
				actualDefault);
		assertEquals("Decorated way of rendering", "now printing ...",
				actualDecorated);
	}

	public void structure_decorator_example2() {
		// arrange: concrete command 'create' and decorate it
		Command createCommand = new CreateCommand();
		CommandDecorator decoratedCreateCommand = new CreateCommandDecorator(createCommand);
		
		// arrange: concrete command 'update' and decorate it
		Command updateCommand = new UpdateCommand();
		CommandDecorator decoratedUpdateCommand = new UpdateCommandDecorator(updateCommand);
	
		// act
		System.out.println("undecorated, default behaviour:");
		createCommand.execute();
		updateCommand.execute();

		System.out.println("\ndecorated, extended behaviour:");
		decoratedCreateCommand.execute();
		decoratedUpdateCommand.execute();
	
		// assert
		// no asserts in this test
	}

	public void structure_proxy() throws RenderException {
		// arrange: a new instance of the proxy behind the public interface
		RenderEngine renderEngine = new RenderEngineProxy();
		
		/* 
		 * Generally the primary call goes to RenderEngineProxy, but subsequently
		 * the MapRenderEngine is really use (by delegating the call)
		 */
		// act: do the things we want to do using the proxy object ...
		String renderResult = renderEngine.render();
	
		// assert
		String actual = "Finished (map) rendering ... saved result in \"c:/myMap.png\"";
		assertEquals(actual, renderResult);
	}

	public void behavior_adapter() {
		// arrange 1: creating rendering processor, our main interface for all 
		// renderings that shall be done
		RenderProcessor renderProcessor = new RenderProcessor();
		
		// For rendering purposes, we need a render engine, first we take our
		// own implementation of this rendering mechanism
		LocalRenderEngine lre = new LocalRenderEngine();
		
		// act 1: do render and print the rendering result
		String result = renderProcessor.render(lre);
	
		// assert 1
		String expected = " ... drawings finished ... saving result locally " +
				          "under c:/temp/myMap.png!"; 
		assertEquals(expected, result);
		
		// arrange 2: secondly, we want to use some proprietary render mechanism, 
		// for instance a purchased one or a provided class without knowing its
		// source (the real render code)
		ProprietaryRenderEngine pre = new ProprietaryRenderEngine();
		
		// Not to call directly the proprietary render method, we wrap the
		// vendor's render engine with some local implementation
		LocalMapRenderEngine lmre = new LocalMapRenderEngine(pre);
		
		// act 2: finally induce renderings using the main processor, which decides 
		// internally what to do by interpreting the current instance's class 
		// type and consequently which render method to call.
		result = renderProcessor.render(lmre);
	
		// assert 2
		expected = " ... rendering finished ... publishing result " +
				   "at http://www.domain.de/map!"; 
		assertEquals(expected, result);
	}

	public void behavior_observer() {
		// arrange: create a new observable subject (implements interface 'Observable')
		Observable spatialMap = new ObservableMap("Map Client");
		
		// create some new observer (each implementing the interface 'Observer')
		Observer observer1 = new MapObserver(1);
		Observer observer2 = new MapObserver(2);
		Observer observer3 = new MapObserver(3);
		
		// register/attach these three observers on the observed subject.
		spatialMap.attach(observer1);
		spatialMap.attach(observer2);
		spatialMap.attach(observer3);
		
		// act: force a "state-change" by calling some setter on the observed 
		// subject, which will cause the update/notification of all attached
		// observing objects (observers).
		spatialMap.setName("UMN Mapserver Map Client");
	
		// assert
		assertEquals("UMN Mapserver Map Client", spatialMap.getName());
	}

	public void behavior_templateMethod() {
		// arrange: service implementation according to the
		// "template method pattern"
		AbstractBusinessService service = new MyBusinessService();
	
		// act: call template method ...
		try {
			// ... using property key "resource.translation.de.DE" internally
			service.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// assert
		assertEquals("resource.translation.de.DE", service.getInput());
		assertEquals("[resource, translation, de, DE]", service.getOutput());
	}

	public void architecture_filterV1() throws FilterException {
		// arrange
		FilterChain filterChain = new FilterChain();
		filterChain.add(new EqualityFilter());
		filterChain.add(new IdentityFilter());
		filterChain.add(new SynonymityFilter());
	
		Input input = new Input();
		input.setName("Thorsten Eckstein");
	
		Output output = new Output(); // with 'committed = false'
		output.setName("Torsten Eckstein");
	
		// act
		filterChain.doFilter(input, output);
	
		// assert: commit() should be done during filter chain walk-through!
		assertTrue(output.isCommitted());
	
		// assert: take a look at the process steps
		String actualTrace = "Filtering: EqualityFilter\n"
				+ "Filtering: IdentityFilter\n"
				+ "Filtering: SynonymityFilter\n" + "End of Queue reached\n";
		assertEquals(actualTrace, filterChain.getTrace());
	}

	public void general_printSupport() {
		// arrange
		PrinterType pType = XML;

		A a = new A();
		a.setPrinterType(pType);
		B b = new B();
		b.setPrinterType(pType);
		C c = new C();
		c.setPrinterType(pType);

		// act: done by calling toString() on each instance in asserts!

		// assert
		assertEquals("<xml type=\"A\">Name=null</xml>", a.toString());
		assertEquals("<xml type=\"B\">ID=0</xml>", b.toString());
		assertEquals("<xml type=\"C\">IsReal=false</xml>", c.toString());
		
		// --------------------------------------------------------------------
		
		// arrange
		pType = STRING;

		a = new A();
		a.setPrinterType(pType);
		b = new B();
		b.setPrinterType(pType);
		c = new C();
		c.setPrinterType(pType);

		// act: done by calling toString() on each instance in asserts!

		// assert
		String expectedA = "\n.[de.dhbw.course12.printsupport.model.A]\n"
				+ "..name=null";
		String expectedC = "\n.[de.dhbw.course12.printsupport.model.C]\n"
				+ "..isreal=false";
		assertEquals(expectedA, a.toString());
		assertEquals(expectedC, c.toString());
	}

}