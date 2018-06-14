package pl.pawel095.sokoban.exception;

public class BadMapFileException extends Exception {
	//ponieważ SERIALIZABLE
	private static final long serialVersionUID = -3640879078077021512L;
	@Override
	public String getMessage() {
		super.getMessage();
		return "BadMapFileException: Invalid Map File";
	}
	
}
