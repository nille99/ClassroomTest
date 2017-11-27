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
	



	
}
