package de.dhbw.course12.adapter;

/**
 * <b>Build on</b>: Nov 7, 2006 <br>
 * <b>@author </b>: Thorsten Eckstein <br>
 * <b>Description </b>: This class is a specilization of the more general
 *    LocalRenderEngine which is able to render not only maps, also other 2D-
 *    or 3D-Shapes etc. This class here is only needed to handle special purposes
 *    when rendering map's. But we don'T wnat to implement it on our own because
 *    we knwo that the purchased API already provides the render mechanism we 
 *    need here and we simply want to call those needed algorithms.
 */
public class LocalMapRenderEngine extends LocalRenderEngine {
	/** The wanted render engine's instance. */
	ProprietaryRenderEngine proprietaryRenderEngine;

	/**
	 * Constructor taking an instance of some proprietary render engine to use
	 * it internally by delegating client calls to that "remote" engine.
	 * @param proprietaryRenderEngine The proprietary render engine.
	 */
	public LocalMapRenderEngine(ProprietaryRenderEngine proprietaryRenderEngine) {
		this.proprietaryRenderEngine = proprietaryRenderEngine;
		super.isDrawing = proprietaryRenderEngine.isCurrentlyDrawing();
	}

	/**
	 * This method overides that one implemented in LocalRenderEngine.
	 * It forwards client calls (as a wrapper) to some proprietary methods/code.
	 */
	public String renderMap() {
		String publishingUrl = this.proprietaryRenderEngine.render();
		super.isDrawing = true;
		return publishingUrl;
	}
	
}
