package junit5;
import org.junit.jupiter.api.*;
import static org.junit.Assert.*;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Suma;

public class CalculadoraTest {

	/*
	 * Podemos ejecutarlas con boton derecho | run as | JUnit Test
	 * 
	 * En este caso no vamos a crear el resto de metodos del ciclo de vida
	 */

	
	@Test
	public void suma2Reales() {
		System.out.println("Test método sumaDosNumerosReales");
		//Se prueba que pasando dos números reales a y b, el resultado sea
		//un real c la suma de ambos. Se pasan los números 4.1 y 3.1
		//La suma debería ser 7.2
		Suma s=new Suma();
		double resultadoEsperado=7.2;
		double resultadoObtenido=s.sumaDosNumerosReales(4.1,3.1);
		assertEquals(resultadoEsperado,resultadoObtenido,0.001,"Los resultados esperado y obtenido no coinciden");
		
	}
	@Test
	public void suma2Enteros() {
		System.out.println("Test método sumaDosNumerosEnteros");
		//Se prueba que pasando dos números enteros a y b, el resultado sea
		//un entero c la suma de ambos. Se pasan los números 4 y 3
		//La suma debería ser 7
		Suma s=new Suma();
		int resultadoEsperado=7;
		int resultadoObtenido=s.sumaDosNumerosEnteros(4, 3);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	@Test
	public void sumaAcumulado() {
		System.out.println("Test método sumaValorAcumulado");
		//Se prueba que pasando un valor X=5 como parámetro, este se va sumando al
		//acumulador.
		Suma s=new Suma();
		int resultadoEsperado=7;
		s.sumaValorAcumulado(5);
		s.sumaValorAcumulado(2);
		int resultadoObtenido=s.getEntero();
		assertEquals(resultadoEsperado,resultadoObtenido);
		System.out.println(resultadoEsperado+" // "+resultadoObtenido);
		
	}

}
