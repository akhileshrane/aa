import java.sql.SQLException;
import java.util.*;
public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDao studentDao = new StudentDao();
		List<Student> allStudentList = studentDao.getAllStudents();
		for(Student student: allStudentList){
		//	System.out.println(""+student);			
			}
		Student student=new Student();
		//studentDao.addStudent(student);
		studentDao.updateStudent(student);
		studentDao.deleteStudent(15);
	}

}
