package de.dhbw.course9.decorator.example1;

public abstract class RenderDecorator implements Renderer {

	private Renderer renderer;

	public RenderDecorator(Renderer renderer) {
		this.renderer = renderer;
	}

	public String render() {
		return renderer.render();
	}

}