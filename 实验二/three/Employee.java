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
		s = "����ʱ��Ϊ��" + this.getTime() +"��   нˮΪ��" + this.getSalary() + "Ԫ/��"; 
	  }else if(this.getType() == 2) {
		s = "����ʱ��Ϊ��" + this.getTime()+"����  нˮΪ��" + this.getSalary() + "Ԫ/��";  
	  }else if(this.getType() == 3) {
		s = "����ʱ��Ϊ��" + this.getTime()+"����  нˮΪ��" + this.getSalary() + "Ԫ/��";  
	  }
	 return s;
}
}