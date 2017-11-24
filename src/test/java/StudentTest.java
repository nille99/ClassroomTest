import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	Student student2 = new Student("Anna", "Anderson", 18, 'W');
	Student student = new Student("Niklas", "Sawn", 26, 'M', 8, 7, 10);

	@Test
	public void testGetFirstGrade() {
		assertEquals(student.getFirstGrade(), 8.0, 0);
	}

	@Test
	public void testGetSecondGrade() {
		assertEquals(student.getSecondGrade(), 7.0, 0);
	}

	@Test
	public void testGetThirdGrade() {
		assertEquals(student.getThirdGrade(), 10.0, 0);
	}

	@Test
	public void testSetFirstGrade() {
		student.setFirstGrade(18.0);
		assertEquals(student.getFirstGrade(), 18.0, 0);
	}

	@Test
	public void testSetSecondGrade() {
		student.setSecondGrade(2.0);
		assertEquals(student.getSecondGrade(), 2.0, 0);
	}

	@Test
	public void testSetThirdGrade() {
		student.setThirdGrade(4.0);
		assertEquals(student.getThirdGrade(), 4.0, 0);
	}

	@Test
	public void testCalculateAverage() {
		double sumOfGrades = 0;
		double averageResult = 0;
		student.setFirstGrade(4.0);
		student.setSecondGrade(77.0);
		student.setThirdGrade(2.0);
		sumOfGrades = student.getFirstGrade() + student.getSecondGrade() + student.getThirdGrade();
		averageResult = sumOfGrades / 3;
		student.calculateAverage(student.getFirstGrade());
		student.calculateAverage(student.getFirstGrade(), student.getSecondGrade(), student.getThirdGrade());
		student.calculateAverage();
		assertEquals(student.getAverageGrade(), averageResult, 0);
	}

	@Test
	public void testHasClearedTheCourse() {
		student.calculateAverage();
		student2.calculateAverage();

		assertEquals(student.hasClearedTheCourse(), true);
		assertEquals(student2.hasClearedTheCourse(), false);

	}

}
