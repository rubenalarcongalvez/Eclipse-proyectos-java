/**
 * 
 */
package com.is.genericos.net;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Trim;

import genericos.Matriz;

/**
 * @author Rubén Alarcón
 *
 */
class TestMatriz {

	Matriz<Integer> matrizEnteros;
	Matriz<String> matrizCadena;

	@BeforeEach
	void antes() {
		matrizEnteros = new Matriz<>(5, 5);
		matrizCadena = new Matriz<>(5, 5);
	}

	@Test
	public void getElementoEnteros() {
		Integer elemento = matrizEnteros.getElemento(2, 4);

		assertEquals(null, elemento);

		matrizEnteros.setNumFilas(2, 4, 48);

		elemento = matrizEnteros.getElemento(2, 4);

		assertEquals(48, elemento);
	}

	@Test
	public void getElementoCadena() {
		String elemento = matrizCadena.getElemento(2, 4);

		assertEquals(null, elemento);

		matrizCadena.setNumFilas(2, 4, "test");

		elemento = matrizCadena.getElemento(2, 4);

		assertEquals("test", elemento);
	}

	@Test
	public void setNumFilasEnteros() {
		matrizEnteros.setNumFilas(3, 4, 48);

		assertEquals(48, matrizEnteros.getElemento(3, 4));
	}

	@Test
	public void setNumFilasCadena() {
		matrizCadena.setNumFilas(3, 4, "test");

		assertEquals("test", matrizCadena.getElemento(3, 4));
	}

	@Test
	public void filasEnteros() {
		assertEquals(5, matrizEnteros.filas());
	}

	@Test
	public void filasCadena() {
		assertEquals(5, matrizCadena.filas());
	}

	@Test
	public void columnasEnteros() {
		assertEquals(5, matrizEnteros.columnas());
	}

	@Test
	public void columnasCadena() {
		assertEquals(5, matrizCadena.columnas());
	}

}
