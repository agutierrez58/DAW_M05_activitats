package DAWM05_UF2_analisisCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	Pila pila_plena;
	Pila pila_buida;

	@BeforeEach public void initTests() {
		pila_buida = new Pila();
		pila_plena = new Pila();
		
		pila_plena.apilar(1);
		pila_plena.apilar(2);
		pila_plena.apilar(3);
		pila_plena.apilar(4);

	}

	@Test
	void testPilaBuida() {
		assertEquals(pila_buida.getNumElements(), 0);
	}

	@Test
	void testApilar() {
		Integer i = new Integer(5);
		int mida = pila_plena.getNumElements();
		pila_plena.apilar(i);
		assertEquals(pila_plena.getNumElements(), mida + 1);
	}

	/*
	@Test
	void testDesapilar() {
		int mida = pila_plena.getNumElements();
		Integer i = (Integer) pila_plena.desapilar();
		assertEquals(i, new Integer(4));
		assertEquals(pila_plena.getNumElements(), mida - 1);
	}
*/

	@Test
	void testGetNumElements() {
		int valor = 0;
		valor = pila_plena.getNumElements();
		assertEquals(pila_plena.getNumElements(), 4);
	}

	 /*
	@Test
	public void testDesapilar_pilaBuida() {
		int mida = pila_buida.getNumElements();
		Integer i = (Integer) pila_buida.desapilar();
		assertEquals(i, null);
		assertEquals(pila_buida.getNumElements(), mida);
	} */

}
