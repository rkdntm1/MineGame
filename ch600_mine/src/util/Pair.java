package util;

public class Pair<F, S> {
	private F frist;
	private S second;
	
	public Pair(F frist, S second) {
		this.frist = frist;
		this.second = second;
	}
	
	public F getFrist() {
		return frist;
	}
	
	public S getSecond() {
		return second;
	}
	
}
