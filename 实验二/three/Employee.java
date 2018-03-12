package three;

public class Employee {
	private int type;
	private int time;
	private int salary;
	
	public int getType() {return type;}
	public void setType(int type) {this.type = type;}
	public int getTime() {return time;}
	public void setTime(int time) {this.time = time;}
	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}
	public Employee(int type, int time, int salary) {
		this.type = type;
		this.time = time;
		this.salary = salary;
	}
	
	public String toString() {
	  String s = "";
	  if(this.getType() == 1) {
		s = "工作时长为：" + this.getTime() +"年   薪水为：" + this.getSalary() + "元/年"; 
	  }else if(this.getType() == 2) {
		s = "工作时长为：" + this.getTime()+"个月  薪水为：" + this.getSalary() + "元/月";  
	  }else if(this.getType() == 3) {
		s = "工作时长为：" + this.getTime()+"个周  薪水为：" + this.getSalary() + "元/周";  
	  }
	 return s;
}
}