package de.dhbw.course12.proxy;
/**
 * <b>Build on</b>: Aug 2, 2012 <br>
 * <b>@author </b>: Thorsten Eckstein <br>
 * <b>Description </b>: This class is the concrete implementation of some
 *    rendering processes, the engine that does it. It implements the engine
 *    interface to ensure that renderings can be done ever by calling the
 *    "render" method.
 */
public class MapRenderEngine implements RenderEngine {

	/**
	 * This method is the concrete implementation of some map rendering process
	 * with a result of such as a rendered file (representing an map image).
	 * @see de.pattern.proxy.RenderEngine#render()
	 */
	public String render() throws RenderException {
		return "Finished (map) rendering ... saved result in \"c:/myMap.png\"";
	}

}
