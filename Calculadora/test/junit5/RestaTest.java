package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Resta;
import calculadora.Suma;

class RestaTest {

	@Test
	public void resta2Reales() {
		System.out.println("Test m�todo restaDosReales");
		//Al pasar dos n�meros reales, el resultado debe ser
		//un real equivalente a la resta de ambos. Se pasan los n�meros 7.3 y 3.1
		//La resta deber�a ser 4.2
		Resta r=new Resta();
		double resultadoEsperado=4.2;
		double resultadoObtenido=r.resta2Reales(7.3,4.2);
		assertEquals(resultadoEsperado,resultadoObtenido,0.001,"Los resultados esperado y obtenido no coinciden");
		
	}
	@Test
	public void resta2Enteros() {
		System.out.println("Test m�todo restaEnteros");
		//Al pasar dos n�meros enteros, el resultado debe ser
		//un entero equivalente a la resta de ambos. Se pasan los n�meros 9 y 5
		//La resta deber�a ser 4
		Resta r=new Resta();
		int resultadoEsperado=4;
		int resultadoObtenido=r.restaEnteros(9, 5);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	@Test
	public void resta3Reales() {
		System.out.println("Test m�todo resta3Reales");
		//Al pasar tres n�meros reales a, b, c, el resultado debe ser
		//un entero equivalente a la resta de ambos. Se pasan los n�meros 16.7, 8.3, 3.1
		//La resta deber�a ser 5
		Resta r=new Resta();
		double resultadoEsperado=5.3;
		double resultadoObtenido= r.resta3Reales(16.7,8.3,3.1);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	public void restaAcum() {
		System.out.println("Test m�todo restaAcum");
		//Al pasar un valor como par�metro, este se va restando al
		//acumulador.
		//El resultado debe ser 3.
		Resta r=new Resta();
		int resultadoEsperado=3;
		r.restaAcum(5);
		r.restaAcum(2);
		int resultadoObtenido=r.getEntero();
		assertEquals(resultadoEsperado,resultadoObtenido);
		System.out.println(resultadoEsperado+" // "+resultadoObtenido);
		
	}
	
}
