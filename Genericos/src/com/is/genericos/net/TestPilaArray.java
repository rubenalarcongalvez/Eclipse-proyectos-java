package com.is.genericos.net;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import genericos.PilaArray;

class TestPilaArray {

	PilaArray<String> pilaString = new PilaArray<>();
	PilaArray<Integer> pilaInteger = new PilaArray<>();
	
	@Test
	void testEstaVacia() {
		assertEquals(true, pilaString.estaVacia());
		assertEquals(true, pilaInteger.estaVacia());
		
		pilaString.anadir("test");
		pilaInteger.anadir(1);
		
		assertEquals(false, pilaString.estaVacia());
		assertEquals(false, pilaInteger.estaVacia());
	}
	
	@Test
	void testAnadir() {
		assertEquals(true, pilaString.estaVacia());
		assertEquals(true, pilaInteger.estaVacia());
		
		pilaString.anadir("test");
		pilaInteger.anadir(1);
		
		assertEquals(false, pilaString.estaVacia());
		assertEquals(false, pilaInteger.estaVacia());
	}
	
	@Test
	void testExtraer() {
		pilaString.anadir("test");
		pilaInteger.anadir(1);
		
		assertEquals(false, pilaString.estaVacia());
		assertEquals(false, pilaInteger.estaVacia());
		
		pilaString.extraer();
		pilaInteger.extraer();
		
		assertEquals(true, pilaString.estaVacia());
		assertEquals(true, pilaInteger.estaVacia());
	}

}
