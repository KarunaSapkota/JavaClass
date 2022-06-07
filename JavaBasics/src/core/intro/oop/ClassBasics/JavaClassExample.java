package core.intro.oop.ClassBasics;

public class JavaClassExample {
	public static void main(String[] args) {
		Student st = new Student();
		st.id = 3;
		st.fName = "Karuna";
		st.lName = "Sapkota";
		st.Email = "karuna@gmail.com";

		System.out.println(st.id + ". " + st.fName + " ");
	}
}
