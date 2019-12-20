
public class Employee extends Human {
	private int empId;
	private double salary;
	public Employee(String name, int age, char gender, int empId, double salary) {
		super(name, age, gender);
		this.empId = empId;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void humanInfo() {
		System.out.println("Emp Id: "+empId);
		System.out.println("Salary: "+salary);
	}
}
