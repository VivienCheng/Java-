package three;

public class Main {
	public static void main(String[] args) {
		System.out.println("1--�������нˮ ");
		System.out.println("2--���¼���нˮ");
		System.out.println("3--���ܼ���нˮ"+'\n');
		
		Employee[] employees = new Employee[6];
		employees[0] = new Employee(1,1,120000);
		employees[1] = new Employee(2,6,5000);
		employees[2] = new Employee(3,32,400);
		employees[3] = new Employee(1,5,200000);
		employees[4] = new Employee(2,30,15000);
		employees[5] = new Employee(3,5,700);
		
		int num = 0;
		for(Employee e : employees) {
			num++;
			System.out.print("Ա��"+num+" ");
			System.out.println(e.toString());
		}
		Company c = new Company(employees);
		int res = c.getEarnings();
		System.out.println('\n'+"����Ա����нˮΪ�� " + res + "Ԫ");	
	}
}