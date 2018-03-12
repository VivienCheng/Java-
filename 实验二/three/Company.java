package three;

public class Company {
	private Employee[] employees;
	private int numOfPerson;

	public int getNumOfPerson() {return numOfPerson;}
	public void setNumOfPerson() {this.numOfPerson = employees.length;}
	public Employee[] getEmployees() {return employees;}
	public void setEmployees(Employee[] employees) {this.employees = employees;}
	public Company(Employee[] employees) {
		this.employees = employees;
		this.numOfPerson = employees.length;
	}
	public int getEarnings() {
		int  sumSalary = 0;
		for(Employee e : employees) {sumSalary += e.getTime() * e.getSalary();}
		return sumSalary;
	}
}