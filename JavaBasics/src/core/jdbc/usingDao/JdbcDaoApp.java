package core.jdbc.usingDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcDaoApp {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		StudentDao sDao = new StudentDao();

		String ch;

		do {
			do {
				System.out.println("Enter your choice: ");
				System.out.println("a. Add a new Student");
				System.out.println("b. View a student's details");
				System.out.println("c. View all Students list");
				System.out.println("d. Update a student's details");
				System.out.println("e. Delete a studnet's details");

				ch = sc.next();

			} while (!(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("b") || ch.equalsIgnoreCase("c")
					|| ch.equalsIgnoreCase("d") || ch.equalsIgnoreCase("e")));
			if (ch.equalsIgnoreCase("a")) {
				Student st = new Student();
				System.out.println("Enter the Student's details: \n First Name:");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				int i = sDao.save(st);
				if (i == 1) {
					System.out.println("Success!!");
				}

			} else if (ch.equalsIgnoreCase("b")) {
				// view student details
				System.out.println("Enter the student's id: ");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				System.out.println(st);
			} else if (ch.equalsIgnoreCase("c")) {
				ArrayList<Student> stList = sDao.getAll();
				for (Student s : stList) {
					System.out.println(s);
				}

			} else if (ch.equalsIgnoreCase("d")) {
				System.out.println("Enter the id to be updated");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				System.out.println(st);
				System.out.println("Enter the Student's new details: \n First Name:");
				st.setfName(sc.next());
				System.out.println("Last Name: ");
				st.setlName(sc.next());
				System.out.println("Email: ");
				st.setEmail(sc.next());
				int i = sDao.update(st);
				if (i == 1) {
					System.out.println("Update Successful..");
				}
			} else if (ch.equalsIgnoreCase("e")) {
				System.out.println("Enter the student's id to be deleted:");
				int id = sc.nextInt();
				Student st = sDao.getOne(id);
				do {
					System.out.println("Confirm delete (y/n): ");
					ch = sc.next();

				} while (!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")));

				if (ch.equalsIgnoreCase("y")) {
					int i = sDao.delete(id);
					if (i == 1) {
						System.out.println("Student deleted.");
					}
				}

			}

			do {
				System.out.println("Do you want to continue(y/n): ");
				ch = sc.next();

			} while (!(ch.equalsIgnoreCase("y") || ch.equalsIgnoreCase("n")));

		} while (ch.equalsIgnoreCase("y"));

	}
}
