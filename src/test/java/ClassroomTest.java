import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	
	ArrayList<Student> students = new ArrayList<Student>();
	Classroom classroom = new Classroom("Test17", "Spring 17", students);
	Student student1 = new Student("Niklas", "Sawen", 40, 'M', 9.5, 15.2, 14.9);
	Student student2 = new Student("Anna", "Andeson", 18, 'M', 2.5, 5.2, 1.9);
	Student student3 = new Student("eva", "Andeson", 18, 'M', 2.5, 5.2, 1.9);
	
	@Test
	public void testAddANewStudent() {
		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		assertEquals(classroom.getStudents(),students);
	}
	@Test
	public void testRemoveStudent() {
		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.removeAStudent("eva");
		classroom.removeAStudent("sara");
		assertEquals(classroom.getStudents().contains("eva"),false);
		//assertEquals(classroom.getStudents().contains("Anna"),true);

	}
	

	@Test
	public void testGetAndSetClassroomName() {
		classroom.setClassroomName("Test18");
		assertEquals(classroom.getClassroomName().equals("Test18"),true);
	}
	@Test
	public void testGetAndSetClassroomTerm() {	
		classroom.setClassroomTerm("Spring 18");
		assertEquals(classroom.getClassroomTerm().equals("Spring 18"),true);
	}

	@Test
	public void testGetAndSetStudents() {	
		classroom.setStudents(students);
		assertEquals(classroom.getStudents(),students);
	}
	
	@Test
	public void testPrintFullRelatory() {
		classroom.addANewStudent(student1);
		classroom.addANewStudent(student2);
		classroom.addANewStudent(student3);
		classroom.printFullRelatory();

	}
}
