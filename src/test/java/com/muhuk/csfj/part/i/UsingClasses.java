package com.muhuk.csfj.part.i;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UsingClasses {
	@Test
	public void instantiatingScalaClass() {
		String aString = "aString";
		int anInteger = 42;	
		assertTrue(new ScalaClass(aString, anInteger) instanceof ScalaClass);
		
		boolean aBool = false;
		assertTrue(new ScalaClass(aBool) instanceof ScalaClass);
	}
	
	@Test
	public void callingMethods() {
		ScalaClass scalaClass = new ScalaClass(true);
		assertEquals(2, scalaClass.plus(1, 1));
	}
	
	@Test
	public void attributeAccessVal() {
		int anInteger = 42;
		ScalaClass scalaClass = new ScalaClass(null, anInteger);
		assertEquals("theString", scalaClass.theString());
		assertEquals(anInteger, scalaClass.anInteger());
	}
	
	@Test
	public void attributeAccessVar() {
		ScalaClass scalaClass = new ScalaClass(null, 0);
		assertEquals("some", scalaClass.someString());
		String another = "another";
		scalaClass.someString_$eq(another);
		assertEquals(another, scalaClass.someString());
	}
}
