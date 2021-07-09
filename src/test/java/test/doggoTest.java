package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import doggo.comp.Doggo;

public class doggoTest {

	Doggo dog = new Doggo();

	@Test
	public void testContains() {

		assertEquals(true, dog.returnList(11).contains("12th"));
	}

	@Test
	public void testDoesntContain() {
		assertEquals(false, dog.returnList(11).contains("11th"));
	}

	@Test
	public void testListSize() {
		assertEquals(false, dog.returnList(11).size() == 99);
	}

}
