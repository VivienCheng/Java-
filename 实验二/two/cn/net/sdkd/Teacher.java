package cn.net.sdkd;

public class Teacher implements Comparable<Teacher>{
	private int no;
	private String name;
	private int age;
	private String seminary;
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public int getNo() {return no;}
	public void setNo(int no) {this.no = no;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSeminary() {return seminary;}
	public void setSeminary(String seminary) {this.seminary = seminary;}
	public Teacher(int no, String name, int age, String seminary) {
		this.no = no;
		this.name = name;
		this.age = age;
		this.seminary = seminary;
	}
	public boolean equals(Teacher t) {return (t.getNo() == this.getNo()) ? true : false;}
	
	@Override
	public String toString() {
		return "编号为" + this.getNo() + "、姓名为" + this.getName() + "、年龄为" + this.getAge() + "的" + this.getSeminary() + "学院老师";
	}
	public int compareTo(Teacher t) {return this.getNo() - t.getNo();}
}