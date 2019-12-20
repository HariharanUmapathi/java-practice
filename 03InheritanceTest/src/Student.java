
public class Student extends Human {
	private int studId;
	private String dept;
	private double gpa;

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + studId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (studId != other.studId)
			return false;
		return true;
	}

	public String toString() {
		String details = String.format("%-4d %-18s %-5s %.1f", studId,super.toString(),dept,gpa);
		return details;
	}
	
	public Student(String name, int age, char gender) {
		super(name, age, gender);
	}
	
	public Student(String name, int age, char gender, int studId, String dept, double gpa) {
		super(name, age, gender);
		this.studId = studId;
		this.dept = dept;
		this.gpa = gpa;
	}
	
	@Deprecated
	@Override
	public void humanInfo() {
		System.out.println("Student Id: "+studId);
		System.out.println("Department: "+dept);
		System.out.println("GPA: "+gpa);
	}
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	
	
}
