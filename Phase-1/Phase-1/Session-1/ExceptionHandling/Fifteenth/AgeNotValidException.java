package Fifteenth;

//Custom Exception
@SuppressWarnings("serial")
public class AgeNotValidException extends Exception{
	
	private String msg;
	
	public AgeNotValidException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "AgeNotValidException [Message=" + msg + "]";
	}

}
