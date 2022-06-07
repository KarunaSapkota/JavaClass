package core.intro.oop.abstraction;

public class EmployeeDao extends AbstractDao {

	@Override
	public void insert() {
		System.out.println("Employee has been inserted in db.");

	}

	@Override
	public void read() {
		System.out.println("Employee has been read from db.");

	}

	@Override
	public void update() {
		System.out.println("Employee has been updated in db.");

	}

	@Override
	public void delete() {
		System.out.println("Employee has been deleted in db.");

	}

}
