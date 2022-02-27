package junit5;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

class CalculadoraTest {

		//Este m�todo con la anotacion @BeforeAll se va a ejecutar ANTES de TODOS 
		//los TEST (m�todos anotados con @Test). Solo se pone una vez esta anotaci�n

		@BeforeAll
		static void setUpBeforeClass() throws Exception {
			System.out.println("Este metodo se ejecuta una unica vez y al principio");
		}

		//Este m�todo con la anotacion @AfterAll sera ejecutado DESPUES de TODOS 
		//los TEST
		@AfterAll
		static void tearDownAfterClass() throws Exception {
			System.out.println("Este metodo se ejecuta una unica vez y al final");		
		}

		//Este m�todo con la anotacion @BeforeEach sera ejecutado ANTES de cada 
		//UNO de los TEST
		//Ejemplo, se ejecutara antes de test1 y antes de test2 (2 veces)
		@BeforeEach
		void setUp() throws Exception {
			System.out.println("Este metodo se ejecuta una vez antes de cada test");
		}

		//Este m�todo con la anotacion @AfterEach sera ejecutado DESPUES de cada 
		//UNO de los TEST
		//Ejemplo, se ejecutara despues del test1 y despues del test2
		@AfterEach
		void tearDown() throws Exception {
			System.out.println("Este metodo se ejecuta una vez despues de cada test");
		}
		
		//Estos ser�an los metodos que ejecutaran las pruebas unitarias
		//Son metodos con la anotacion @Test, y podemos tener todos los 
		//metodos que queramos con esta anotacion
		@Test
		void test1() {
			System.out.println("Test1. Esto es una prueba unitaria de palo :P");
		}

		@Test
		void test2() {
			System.out.println("Test2. Esto es otra prueba unitaria de palo :)");
		}
		
		//Ejemplo de ejecucion para esta clase
		//boton derecho sobre la clase | run us | JUnit Test
		
		//El ciclo de vida ser�a el siguiente
		/*
		 * 1 BeforeAll
		 * 2 BeforeEach
		 * 3 Test1
		 * 4 AfterEach
		 * 5 BeforeEach
		 * 6 Test2
		 * 7 AfterEach
		 * 8 AfterAll
		 */	

}
