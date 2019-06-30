package generic;

public class TestGeneric <T>{
	private T first;
	private T Two;
	private T thiree;
	private T last;
	public TestGeneric(T K){
		this.first = K;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getTwo() {
		return Two;
	}
	public void setTwo(T two) {
		Two = two;
	}
	public T getThiree() {
		return thiree;
	}
	public void setThiree(T thiree) {
		this.thiree = thiree;
	}
	public T getLast() {
		return last;
	}
	public void setLast(T last) {
		this.last = last;
	}
	

}

