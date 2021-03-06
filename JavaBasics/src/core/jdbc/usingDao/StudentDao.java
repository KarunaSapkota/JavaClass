package core.jdbc.usingDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao extends AbstractDao<Student> {
	PreparedStatement pstm;
	String query;
	ResultSet rs;

	@Override
	public int save(Student st) throws SQLException {
		connect();
		query = "Insert into Student(fName, lName, email) values(?,?,?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Student getOne(int id) throws SQLException {
		connect();
		query = "Select * from student where id=?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		if (rs.next()) {
			Student st = new Student(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"),
					rs.getString("email"));
			disconnect();
			return st;

		}
		disconnect();
		return null;
	}

	@Override
	public ArrayList<Student> getAll() throws SQLException {
		ArrayList<Student> stList = new ArrayList();
		connect();
		query = "SELECT * FROM student";
		pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		while (rs.next()) {
			Student st = new Student(rs.getInt("id"), rs.getString("fName"), rs.getString("lName"),
					rs.getString("email"));
			stList.add(st);

		}
		disconnect();

		return stList;
	}

	@Override
	public int update(Student st) throws SQLException {
		connect();
		query = "UPDATE Student set fName=?, lName=?, email=? where id=?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getfName());
		pstm.setString(2, st.getlName());
		pstm.setString(3, st.getEmail());
		pstm.setInt(4, st.getId());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException {
		connect();
		query = "DELETE from Student where id=? ";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();

		disconnect();
		return i;
	}

}
