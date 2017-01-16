package se.coredev.security.ex8;

public final class LonelyException extends Exception {
	
	private static final long serialVersionUID = 1402493956606758677L;
	public transient static final LonelyException INSTANCE = new LonelyException("There can be only one!");

	private LonelyException(String message) {
		super(message);
	}
	
}
