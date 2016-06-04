package com.muhuk.csfj.part.ii;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import scala.collection.immutable.HashMap;

public class Subclassing {

	@Test
	public void subclassing() {
		ExtendClass extendClass = new ExtendClass();
		assertEquals(true, extendClass.identity(true));
		assertEquals(false, extendClass.identity(false));
	}

	@Test
	public void typeAliasObject() {
		ExtendAbstractA extendAbstract = new ExtendAbstractA();
		assertEquals(false, extendAbstract.x());
		assertTrue(extendAbstract.x() instanceof Boolean);
	}

	@Test
	public void typeAliasScalaClass() {
		ExtendAbstractB extendAbstract = new ExtendAbstractB();
		assertTrue(extendAbstract.x() instanceof ScalaClass);
	}

	@Test
	public void traitDefaultImplementation() {
		ExtendTrait extendTrait = new ExtendTrait();
		assertEquals(23, extendTrait.bar(1));
	}

	@Test
	public void companionOfCollection() {
		HashMap immutableMap = new HashMap();
		Object mapCompanion = immutableMap.companion();
		assertTrue(mapCompanion instanceof scala.collection.immutable.Iterable$);
	}

	@Test
	public void singleton() {
		Singleton$ singletonInstance = Singleton$.MODULE$;
		assertEquals("There can be only one.", singletonInstance.foo());
	}
}
