import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;
import otherclasses.Student;

public class StudentTest {
	
	//Testing from extends Person
	
Person s = new Person("Niklas", "sawen", 40,'M');
	
	@Test
	public void testSetAndGetFirstName() {
		s.setFirstName("kalle");
		assertEquals(s.getFirstName().equals("kalle"),true);
	}
	@Test
	public void testSetAndGetLastName() {
		s.setLastName("sawen");
		assertEquals(s.getLastName().equals("sawen"),true);
	}
	@Test
	public void testSetAndGetAge() {
		s.setAge(26);
		assertEquals(s.getAge(),26);
	}
	@Test
	public void testSetAndGetGender() {
		s.setGender('W');
		assertEquals(s.getGender(),'W');
	}
	
	//Testing of Student
	

	Student student2 = new Student("Anna", "Anderson", 18, 'W');
	Student student = new Student("Niklas", "Sawn", 26, 'M', 8, 7, 10);

	@Test
	public void testGetAndSetFirstGrade() {
		student.setFirstGrade(18.0);
		assertEquals(student.getFirstGrade(), 18.0, 0);
	}

	@Test
	public void testGetAndSetSecondGrade() {
		student.setSecondGrade(2.0);
		assertEquals(student.getSecondGrade(), 2.0, 0);
	}

	@Test
	public void testGetAndSetThirdGrade() {
		student.setThirdGrade(4.0);
		assertEquals(student.getThirdGrade(), 4.0, 0);
	}

	@Test
	public void testSetandGetAverageGrade() {
		student.setAverageGrade(5.0);
		assertEquals(student.getAverageGrade(), 5.0, 0);
		//assertEquals(student.getAverageGrade() == 5.0, true);
	}

	@Test
	public void testCalculateAveragewithParam() {
		student.setSecondGrade(5);
		student.setThirdGrade(5);
		double result = student.calculateAverage(5);
		assertEquals(student.getAverageGrade(), result, 0);
		//assertEquals((student.getAverageGrade() == result) && (result == 5), true);
	}

	@Test
	public void testCalculateAveragewithNoParam() {
		student.setFirstGrade(5);
		student.setSecondGrade(5);
		student.setThirdGrade(5);
		student.calculateAverage();
		assertEquals(student.getAverageGrade(), 5.0, 0);
		//assertEquals((student.getAverageGrade() == 5), true);

	}

	@Test
	public void testCalculateAveragewithAllParam() {
		double result = student.calculateAverage(5, 5, 5);
		assertEquals(student.getAverageGrade(), result, 0);
		//assertEquals((student.getAverageGrade() == result) && (result == 5), true);
	}

	
	@Test
	public void testHasClearedTheCourse() {
		student.setAverageGrade(6.0);
		assertEquals(student.hasClearedTheCourse(), true);
		
		student.setAverageGrade(4.0);
		assertEquals(student.hasClearedTheCourse(), false);
	}
	
	@Test
	public void testToString() {
		student.setFirstGrade(5.0);
		student.setSecondGrade(5);
		student.setThirdGrade(5);
		//System.out.println(s.toString());
		
		String expected = "The student has not cleared the course";
			
		assertEquals(student.toString().contains(expected), true);
		
		student.setFirstGrade(7.0);
		student.setSecondGrade(7);
		student.setThirdGrade(7);
		//System.out.println(s.toString());
		
		String expected2 = "The student has cleared the course";
		
		//String expected2 = "\nThe student has cleared the course\n-----------------------";
		
		assertEquals(student.toString().contains(expected2), true);
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



}
