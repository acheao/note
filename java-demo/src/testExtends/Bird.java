package testExtends;

public class Bird {
	private String eye = "eye";
	private String wing = "wing";
	private String leg = "leg";
	
	public Bird(String a){
		
	}
	protected String getEye() {
		System.out.println("-------");
		return eye;
	}
	public void setEye(String eye) {
		this.eye = eye;
	}
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	public String getLeg() {
		return leg;
	}
	public void setLeg(String leg) {
		this.leg = leg;
	}
	

}
