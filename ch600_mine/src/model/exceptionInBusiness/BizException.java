package model.exceptionInBusiness;

public class BizException extends Exception {
	
	private String msg;

	public BizException(String msg) {
		super();
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}
	
	
}
