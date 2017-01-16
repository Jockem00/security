package se.coredev.security.ex8;

public final class LonelyExceptionFixed extends Exception {

	private static final long serialVersionUID = 1402493956606758677L;
	public transient static final LonelyExceptionFixed INSTANCE = new LonelyExceptionFixed("There can be only one!");

	private LonelyExceptionFixed(String message) {
		super(message);
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
	
}
