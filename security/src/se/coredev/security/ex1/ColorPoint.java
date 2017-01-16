package se.coredev.security.ex1;

public final class ColorPoint extends Point {

	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	protected String getName() {
		return super.getName() + ":" + color;
	}
}
