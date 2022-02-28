package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Cociente;
import calculadora.Suma;

class CalculadoraTestCociente {

	@Test
	//Se prueba que pasando dos n�meros reales a y b, el resultado sea
	//un real c el cociente de ambos. Se pasan los n�meros 15.54 y 2.1
	//El cociente deber�a ser 7.4
	public void DivisionReales() {
		System.out.println("Test m�todo sumaDosNumerosReales");
		Cociente c=new Cociente(0, 0, 0, 0, 0, 0);
		double resultadoEsperado=7.4;
		double resultadoObtenido=c.DivisionReales(15.54,2.1);
		assertEquals(resultadoEsperado,resultadoObtenido,0.001,"Los resultados esperado y obtenido no coinciden");
		
	}
	@Test
	//Se prueba que pasando dos n�meros enteros a y b, el resultado sea
	//un entero c la cociente de ambos. Se pasan los n�meros 8 y 2.
	//El cociente deber�a ser 4
	public void DivisionEnteros() {
		System.out.println("Test m�todo sumaDosNumerosEnteros");
		Cociente c=new Cociente();
		int resultadoEsperado=4;
		int resultadoObtenido=c.DivisionEnteros(8, 2);
		assertEquals(resultadoEsperado,resultadoObtenido);		
	}
		
	}

