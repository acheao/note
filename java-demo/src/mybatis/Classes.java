package mybatis;

import java.util.List;

public class Classes {
	private int id;
	private String num;
	private String grade;
	private List<Students> studets;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<Students> getStudets() {
		return studets;
	}
	public void setStudets(List<Students> studets) {
		this.studets = studets;
	}

}
