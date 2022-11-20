package de.juwi.pattern.adapter;

/**
 * <b>Build on</b>: Aug 2, 2012<br>
 * <b>@author </b>: Thorsten Eckstein <br>
 * <b>Description </b>: This class is meant to be a single general interface
 *    to access some rendering mechanism while not specifying what algorithm
 *    resp. implementation to use (this will be decided at runtime dependent
 *    on the class type as specified when the "render" method hers is called).
 *    
 * 
 *  The UML diagram for this adapter pattern is shown below:
 * <pre>                                                                                      
 * +-----------------+      +-------------------+                                     
 * | RenderProcessor | uses | LocalRenderEngine |                                     
 * +-----------------+      +-------------------+                                     
 *                    u              / \                                              
 *                     s              | extends                                       
 *                      e             |                                               
 *                       s +----------------------+        +------------------------+
 *                         | LocalMapRenderEngine >-calls-> ProprietaryRenderEngine |
 *                         +----------------------+        +------------------------+
 * </pre>
 * 
 */
public class RenderProcessor {

	/**
	 * Renders "something" ;-) using the specified engine.
	 * @param localRenderEngine The engine to use.
	 * @return the render result.
	 */
	public String render(LocalRenderEngine localRenderEngine) {
		return localRenderEngine.renderMap();
	}

}
