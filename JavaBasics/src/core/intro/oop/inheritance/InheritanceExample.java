package core.intro.oop.inheritance;

public class InheritanceExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.fname = "Jack";
		p.lName = "Daniel";
		p.address = "NY";
		p.display();

		Employee emp = new Employee();
		emp.address = "KTM";
		emp.fname = "Krishna";
		emp.lName = "Dahal";
		emp.empId = 123;
		emp.post = "Executive";
		emp.dept = "IT";
		emp.salary = 12345f;

		emp.display();
	}
}
