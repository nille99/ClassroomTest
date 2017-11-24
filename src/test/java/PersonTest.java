import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	Person p = new Person("Niklas", "sawen", 40,'M');
	@Test
	public void testFirstGetName() {
		assertEquals(p.getFirstName().equals("Niklas"),true);
	}
	@Test
	public void testGetAge() {	
		assertEquals(p.getAge(),40);
	}
	@Test
	public void testGetLastName() {	
		assertEquals(p.getLastName().equals("sawen"),true);
	}	

	@Test
	public void testGetGender() {	
		assertEquals(p.getGender(),'M');
	}

	@Test
	public void testFirstSetName() {
		p.setFirstName("Anna");
		assertEquals(p.getFirstName().equals("Anna"),true);
	}
	@Test
	public void testSetAge() {	
		p.setAge(26);
		assertEquals(p.getAge(),26);
	}
	@Test
	public void testSetLastName() {	
		p.setLastName("Anderson");
		assertEquals(p.getLastName().equals("Anderson"),true);
	}	

	@Test
	public void testSetGender() {	
		p.setGender('W');
		assertEquals(p.getGender(),'W');
	}

}
