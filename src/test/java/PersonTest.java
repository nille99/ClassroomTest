import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;
import otherclasses.Student;

public class PersonTest {

	Student s = new Student("Niklas", "sawen", 40,'M');
	Student s2 = new Student("Rafael", "Silva", 31, 'M', 3.4, 5.5, 6.5);
	
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
	

	@Test
	public void testSetandGetFirstGrade() {
		s.setFirstGrade(5.5);
		assertEquals(s.getFirstGrade() == 5.5, true);
	}

	@Test
	public void testSetandGetSecondGrade() {
		s.setSecondGrade(6.5);
		assertEquals(s.getSecondGrade() == 6.5, true);
	}

	@Test
	public void testSetandGetThirdGrade() {
		s.setThirdGrade(7.5);
		assertEquals(s.getThirdGrade() == 7.5, true);
	}

	@Test
	public void testSetandGetAverageGrade() {
		s.setAverageGrade(5.0);
		assertEquals(s.getAverageGrade() == 5.0, true);
	}

	@Test
	public void testCalculateAveragewithParam() {
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		double result = s.calculateAverage(5);

		assertEquals((s.getAverageGrade() == result) && (result == 5), true);
	}

	@Test
	public void testCalculateAveragewithNoParam() {
		s.setFirstGrade(5);
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		s.calculateAverage();

		assertEquals((s.getAverageGrade() == 5), true);

	}

	@Test
	public void testCalculateAveragewithAllParam() {
		double result = s.calculateAverage(5, 5, 5);
		assertEquals((s.getAverageGrade() == result) && (result == 5), true);
	}
		
	@Test
	public void testHasClearedTheCourse() {
		s.setAverageGrade(6.0);
		assertEquals(s.hasClearedTheCourse(), true);
		
		s.setAverageGrade(4.0);
		assertEquals(s.hasClearedTheCourse(), false);
	}
	
	@Test
	public void testToString() {
		s.setFirstGrade(5.0);
		s.setSecondGrade(5);
		s.setThirdGrade(5);
		//System.out.println(s.toString());
		
		String expected = "The student has not cleared the course";
			
		assertEquals(s.toString().contains(expected), true);
		
		s.setFirstGrade(7.0);
		s.setSecondGrade(7);
		s.setThirdGrade(7);
		//System.out.println(s.toString());
		
		String expected2 = "The student has cleared the course";
			
		assertEquals(s.toString().contains(expected2), true);
}

}
