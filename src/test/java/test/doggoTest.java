package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import doggo.comp.Doggo;

public class doggoTest {

	@Test
	public void test1() {
		String expected = "This list is 99 entries long";
		String actual = "1";

		assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		Doggo dog = new Doggo();

		Boolean expected = false;
		String actual = dog.returnList(7);

		assertEquals(expected, actual);
	}

}
