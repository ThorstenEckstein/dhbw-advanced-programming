package de.dhbw.course9;

import de.dhbw.course9.adapter.ProprietaryRenderEngine;
import de.dhbw.course9.adapter.Renderer;
import de.dhbw.course9.adapter.SelfMadeMapRenderEngine;
import de.dhbw.course9.adapter.SelfMadeRenderEngine;
import de.dhbw.course9.decorator.example1.DefaultRenderer;
import de.dhbw.course9.decorator.example1.RenderAndPrintDecorator;
import de.dhbw.course9.decorator.example2.commands.Command;
import de.dhbw.course9.decorator.example2.commands.CreateCommand;
import de.dhbw.course9.decorator.example2.commands.UpdateCommand;
import de.dhbw.course9.decorator.example2.decorator.CommandDecorator;
import de.dhbw.course9.decorator.example2.decorator.CreateCommandDecorator;
import de.dhbw.course9.decorator.example2.decorator.UpdateCommandDecorator;
import de.dhbw.course9.factory.Train;
import de.dhbw.course9.model.Entity;
import de.dhbw.course9.facade.Printer;
import de.dhbw.course9.filter.v1.FilterChain;
import de.dhbw.course9.filter.v1.FilterException;
import de.dhbw.course9.filter.v1.impl.EqualityFilter;
import de.dhbw.course9.filter.v1.impl.IdentityFilter;
import de.dhbw.course9.filter.v1.impl.SynonymityFilter;
import de.dhbw.course9.filter.v1.mock.Input;
import de.dhbw.course9.filter.v1.mock.Output;
import de.dhbw.course9.filter.v2.mock.MockFactory;
import de.dhbw.course9.observer.MapObserver;
import de.dhbw.course9.observer.Observable;
import de.dhbw.course9.observer.ObservableMap;
import de.dhbw.course9.observer.Observer;
import de.dhbw.course9.proxy.RenderEngine;
import de.dhbw.course9.proxy.RenderEngineProxy;
import de.dhbw.course9.proxy.RenderException;
import de.dhbw.course9.strategy.DetailedPrintStrategy;
import de.dhbw.course9.strategy.PrintContext;
import de.dhbw.course9.strategy.SimplePrintStrategy;
import de.dhbw.course9.strategy.SwitchPrinter;
import de.dhbw.course9.factory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternTest {

	protected MockFactory mf;

	public void setUp() {
		mf = new MockFactory();
	}

	//tag::pattern-creation-factory[]
	@Test
	public void creation_factory() {
		// given
		TrainFactory factory = new PassengerTrainFactory();
		Engine engine = Engine.Electric;

		// when
		Train passengerTrain = factory.create(engine);

		// then
		assertEquals(Engine.Electric, passengerTrain.getEngine());
	}
	//end::pattern-creation-factory[]

	//tag::pattern-structure-decorator-1[]
	@Test
	public void structure_decorator_example1() {
		// arrange: create default
		de.dhbw.course9.decorator.example1.Renderer defaultRenderer =
				new DefaultRenderer();
		// ... now decorate the default
		de.dhbw.course9.decorator.example1.Renderer decoratedRenderer =
				new RenderAndPrintDecorator(defaultRenderer);

		// act
		String actualDefault = defaultRenderer.render();
		String actualDecorated = decoratedRenderer.render();

		// assert 1 - "Default way of rendering"
		assertEquals("doing default rendering ...", actualDefault);
		// assert 2 - "Decorated way of rendering"
		assertEquals("now printing ...", actualDecorated);
	}
	//end::pattern-structure-decorator-1[]

	//tag::pattern-structure-decorator-2[]
	@Test
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
	//end::pattern-structure-decorator-2[]

	//tag::pattern-structure-proxy[]
	@Test
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
	//end::pattern-structure-proxy[]

	//tag::pattern-behavior-observer[]
	@Test
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
	//end::pattern-behavior-observer[]

	//tag::pattern-behavior-strategy[]
	@Test
	public void behavior_strategy_or_switch() {
		// given
		final SwitchPrinter.Format xml = SwitchPrinter.Format.Xml;

		SwitchPrinter printer = new SwitchPrinter();
		PrintContext context = new PrintContext();
		context.add("format", xml);

		// when
		printer.print(xml, context);

		// then
	}
	//end::pattern-behavior-strategy[]

	//tag::pattern-behavior-template[]
	@Test
	public void behavior_strategy_facade_templateMethod() {
		// given
		Printer simplePrinter = new Printer(new SimplePrintStrategy());
		Printer detailedPrinter = new Printer(new DetailedPrintStrategy());
		Entity entity = new Entity("1234");

		// when
		simplePrinter
				.caller("testStrategyPattern")
				.entity(entity)
				.print();

		detailedPrinter
				.caller("testStrategyPattern")
				.entity(entity)
				.item("mykey", "myvalue")
				.print();

		// then
	}
	//end::pattern-behavior-template[]

	//tag::pattern-behavior-adapter[]
	@Test
	public void behavior_adapter() {

		// (1) complete self-implemented use case

		// given: create renderer, the main interface for renderings that shall be done (can acts as a facade!)
		Renderer renderer = new Renderer();
		// For rendering purposes, a render engine is required, use self-made implementation of this rendering mechanism
		SelfMadeRenderEngine engine = new SelfMadeRenderEngine();

		// when: do render and print the rendering result (could also be implemented using strategy pattern!)
		String result = renderer.render(engine);

		// then
		String expected = " ... drawings finished ... saving result locally under c:/temp/myMap.png!";
		assertEquals(expected, result);

		// (2) use case integrating a proprietary implementation by using adapter pattern

		// given: now use some proprietary render mechanism, for instance a purchased one or a provided class
		// without knowing its internals (the real render code)
		ProprietaryRenderEngine pre = new ProprietaryRenderEngine();
		// In order not to call the proprietary render method directly, wrap the vendor's render engine with some
		// self-made implementation
		engine = new SelfMadeMapRenderEngine(pre);

		// when: execute renderings using the main processor, which decides what to do internally by interpreting
		// the current instance's class type and which render method to call.
		result = renderer.render(engine);

		// then
		expected = " ... rendering finished ... publishing result at http://www.domain.de/map!";
		assertEquals(expected, result);
	}
	//end::pattern-behavior-adapter[]

	//tag::pattern-architecture-filter-1[]
	@Test
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
		String actualTrace = """
				Filtering: EqualityFilter
				Filtering: IdentityFilter
				Filtering: SynonymityFilter
				End of Queue reached
				""";
		assertEquals(actualTrace, filterChain.getTrace());
	}
	//end::pattern-architecture-filter-1[]

}