package se.coredev.security.ex1;

public class PointFixed {
	
	private final int x;
	private final int y;
	private String name;

	public PointFixed(int x, int y) {
		this.x = x;
		this.y = y;
		this.name = getName();
	}

	protected String getName() {
		return "[x:" + x + "," + y + "]";
	}

	@Override
	public final synchronized String toString() {
		if (name == null) {
			name = getName();
		}
		return name; 
	}
}
