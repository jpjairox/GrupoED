package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Cociente;

import calculadora:cociente;

import calculadora.Producto;
import calculadora.Consola;
class TestCalculadora {

	@Test
	
	//Metodos de la prueba de la clase Producto
		
		@Test
		public void dosNumerosReales() {
			System.out.println("Test método dosNumerosReales");
			//Para la prueba paso dos numeros reales a y b y el resultado sera
			//un real c fruto del producto de ambos
			//Se pasan los números 5.5 y 5.5
			//El cociente debería ser 30.25
			Producto p=new Producto();
			double resultadoEsperado=30.25;
			double resultadoObtenido=p.dosNumerosReales(5.5,5.5);
			assertEquals(resultadoEsperado,resultadoObtenido,0.001,"Los resultados esperados no coinciden");
			
		}
		@Test
		public void dosNumerosEnteros() {
			System.out.println("Test método dosNumerosEnteros");
			//Para la prueba paso dos números enteros a y b, el resultado sera
			//un entero c fruto del cociente de ambos
			//Se pasan los números 10 y 5
			//El producto debería ser 50
			Producto p=new Producto();
			int resultadoEsperado=50;
			int resultadoObtenido=p.dosNumerosEnteros(10, 5);
			assertEquals(resultadoEsperado,resultadoObtenido);
			
		}
		@Test
		public void tresNumerosreales() {
			System.out.println("Test método tresNumerosreales");
			//Para la prueba paso tres números enteros a, b y c, el resultado sera
			//un entero c fruto del cociente de los tres
			//Se pasan los números 10 y 5 y 2
			//El producto debería ser 100
			Producto p=new Producto();
			int resultadoEsperado=100;
			int resultadoObtenido=p.tresNumerosReales();
			assertEquals(resultadoEsperado,resultadoObtenido);
			
			
		}
		@Test
		public void potencia() {
			System.out.println("Test método potencia");
			//Para la prueba paso un numero y un exponente, el resultado sera
			//un entero c fruto de la potencia del numero elevado al exponente
			//Se pasa el número 2 y el exponente 2 
			//El producto debería ser 4
			Producto p=new Producto();
			int resultadoEsperado=4;
			int resultadoObtenido=p.potencia();
			assertEquals(resultadoEsperado,resultadoObtenido);
			
		}
		
		
		
	}

}
