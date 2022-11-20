package de.dhbw.course12.adapter;

/**
 * <b>Build on</b>: Aug 2, 2012<br>
 * <b>@author </b>: Thorsten Eckstein <br>
 * <b>Description </b>: This class is some render implementation as part of the
 *   own Render-API. It provides some drawing state and a general implementation
 *   of "drawing some map".
 */
public class LocalRenderEngine {
	
	/** Equivalent to the proprietary render engine, we also want to provide 
	 * some "state-saving" member here. */
	boolean isDrawing = false;
	/** Simple no-args default constructor. */
	public LocalRenderEngine() { }

	/**
	 * Our own implementation of map-rendering-processes.
	 * @return the resulting map file's location (e.g. within local filesystem).
	 */
	public String renderMap(){
		isDrawing = true;
		System.out.println(getClass().getSimpleName()+" is now drawing a map ...");
		return " ... drawings finished ... saving result locally under c:/temp/myMap.png!";
	}
	
	/**
	 * Dummy method to represent alternative ways to render things. It is 
	 * declared final, because it shall not be overidden by extending classes.
	 * @return the render result.
	 */
	final Object renderShape() {
		return "";
	}
	
	/**
	 * Dummy method to represent alternative ways to render things. It is 
	 * declared final, because it shall not be overidden by extending classes.
	 * @return the render result.
	 */	
	final Object render3D() {
		return "";
	}
	
}
