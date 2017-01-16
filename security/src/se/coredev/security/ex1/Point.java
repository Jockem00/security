package se.coredev.security.ex1;

public class Point {
	
	private final int x;
	private final int y;
	private final String name;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.name = getName();
	}

	protected String getName() {
		return "[x:" + x + "," + y + "]";
	}

	@Override
	public final synchronized String toString() {
		return name; 
	}
}