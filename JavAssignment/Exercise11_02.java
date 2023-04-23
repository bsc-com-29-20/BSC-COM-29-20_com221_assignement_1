


public class Exercise11_02 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Matthews Botoman");
		Student student = new Student(Student.SENIOR);
		student.setName("Madea Morales");
		Employee employee = new Employee("Kampala, UG", 890_500.00, new MyDate());
		employee.setName("Mayamiko Cortana");
		Faculty faculty = new Faculty(new double[]{9.0, 5.0}, 5);
		faculty.setName("Mosallah Bizmark");
		Staff staff = new Staff("Capetown, SA", 900_000.00, new MyDate(), "CTO");
		staff.setName("Caroline Keanu");

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}
}	

