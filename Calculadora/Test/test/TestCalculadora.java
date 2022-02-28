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
			System.out.println("Test m�todo dosNumerosReales");
			//Para la prueba paso dos numeros reales a y b y el resultado sera
			//un real c fruto del producto de ambos
			//Se pasan los n�meros 5.5 y 5.5
			//El cociente deber�a ser 30.25
			Producto p=new Producto();
			double resultadoEsperado=30.25;
			double resultadoObtenido=p.dosNumerosReales(5.5,5.5);
			assertEquals(resultadoEsperado,resultadoObtenido,0.001,"Los resultados esperados no coinciden");
			
		}
		@Test
		public void dosNumerosEnteros() {
			System.out.println("Test m�todo dosNumerosEnteros");
			//Para la prueba paso dos n�meros enteros a y b, el resultado sera
			//un entero c fruto del cociente de ambos
			//Se pasan los n�meros 10 y 5
			//El producto deber�a ser 50
			Producto p=new Producto();
			int resultadoEsperado=50;
			int resultadoObtenido=p.dosNumerosEnteros(10, 5);
			assertEquals(resultadoEsperado,resultadoObtenido);
			
		}
		@Test
		public void tresNumerosreales() {
			System.out.println("Test m�todo tresNumerosreales");
			//Para la prueba paso tres n�meros enteros a, b y c, el resultado sera
			//un entero c fruto del cociente de los tres
			//Se pasan los n�meros 10 y 5 y 2
			//El producto deber�a ser 100
			Producto p=new Producto();
			int resultadoEsperado=100;
			int resultadoObtenido=p.tresNumerosReales();
			assertEquals(resultadoEsperado,resultadoObtenido);
			
			
		}
		@Test
		public void potencia() {
			System.out.println("Test m�todo potencia");
			//Para la prueba paso un numero y un exponente, el resultado sera
			//un entero c fruto de la potencia del numero elevado al exponente
			//Se pasa el n�mero 2 y el exponente 2 
			//El producto deber�a ser 4
			Producto p=new Producto();
			int resultadoEsperado=4;
			int resultadoObtenido=p.potencia();
			assertEquals(resultadoEsperado,resultadoObtenido);
			
		}
		
		
		
	}

}
