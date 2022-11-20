package de.juwi.pattern.adapter;

/**
 * <b>Build on</b>: Aug 2, 2012<br>
 * <b>@author </b>: Thorsten Eckstein <br>
 * <b>Description </b>: This class represents some unknown implementation. 
 *    It provides some proprietary code and may be purchased from a vendor
 *    or the using client don't know the real code within this class (it is
 *    not an open source class).
 */
public class ProprietaryRenderEngine {

	/** A simple member to show that client wnat to have access to class internals. */
	private boolean isCurrentlyDrawing;

	/** A simple no-args default constructor as often provided by proprietary API's. */
	public ProprietaryRenderEngine() {
		isCurrentlyDrawing = false;
	}

	/**
	 * Accesses the isCurrentlyDrawing member 
	 * @return the isCurrentlyDrawing attributes value.
	 */
	public boolean isCurrentlyDrawing() {
		return isCurrentlyDrawing;
	}

	/**
	 * Sets this attribute isCurrentlyDrawing to isCurrentlyDrawing
	 * @param isCurrentlyDrawing The drawing state.
	 */
	public void setIsCurrentlyDrawing(boolean isCurrentlyDrawing) {
		this.isCurrentlyDrawing = isCurrentlyDrawing;
	}
	
	/**
	 * Method to represent some complex algorithm provided by some proprietary
	 * API or product. The method implementation is not visibly and thus not
	 * known by the calling client. Although this method figures its purpose not 
	 * out, we know that this method actually renders map's!
	 * @return The result of this render mechanism (here: the publishing location)
	 */
	public String render() {
		this.isCurrentlyDrawing = true;
		System.out.println(getClass().getSimpleName()+" is now rendering the map ...");
		return " ... rendering finished ... publishing result at http://www.domain.de/map!";
	}
	
}
