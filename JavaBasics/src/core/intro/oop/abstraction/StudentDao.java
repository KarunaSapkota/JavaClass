package core.intro.oop.abstraction;

public class StudentDao extends AbstractDao {

	@Override
	public void insert() {
		System.out.println("Student saved to the database.");

	}

	@Override
	public void read() {
		System.out.println("Student read from database.");

	}

	@Override
	public void update() {
		System.out.println("Student has been updated in the database.");
	}

	@Override
	public void delete() {
		System.out.println("Student has been deleted from the database.");

	}

}
