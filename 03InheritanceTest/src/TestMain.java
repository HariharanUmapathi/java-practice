import java.util.Date;

public class TestMain {

	@MyAnnotation(age = 10, name = "John") 
	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) {
		Student s1 = new Student("Student1", 12, 'F', 1023, "EEE", 9.34);
		Student s2 = new Student("Student1", 12, 'F', 1023, "CSE", 9.34);
		
		s1.humanInfo();
	
		Date d = new Date();
		
		System.out.println(d.getYear());
	}
	
	
	
	
}
