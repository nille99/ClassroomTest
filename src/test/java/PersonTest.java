import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	Person p = new Person("Niklas", "sawen", 40,'M');
	
	@Test
	public void testSetAndGetFirstName() {
		p.setFirstName("kalle");
		assertEquals(p.getFirstName().equals("kalle"),true);
	}
	@Test
	public void testSetAndGetLastName() {
		p.setFirstName("sawen");
		assertEquals(p.getFirstName().equals("sawen"),true);
	}
	@Test
	public void testSetAndGetAge() {
		p.setAge(26);
		assertEquals(p.getAge(),26);
	}
	@Test
	public void testSetAndGetGender() {
		p.setGender('W');
		assertEquals(p.getGender(),'W');
	}
	



}
