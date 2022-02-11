/**
 * Esta clase sirve para sumar números enteros o reales por separado así como para añadir números reales a un acumulador.
 * @author Salvador
 * @version 1.0
 */
 
public class Suma {
    private int entero;
    private double real;
    
    public Suma() {
    	this.entero=0;
    	this.real=0.0;
    }
    
    public void setEntero(int entero) { //Usa "void" porque no necesita devolver ningún valor. Sólo modificarlo.
		this.entero=entero;
	}
	public int getEntero() { //Especifica el tipo que se va a devlover a través de return. En este caso "String".
		return this.entero;
	}
	
	public void setReal(double real) { 
		this.real=real;
	}
	public double getReal() {
		return this.real;
	}
	
	
	/**
	 *Método que realiza la suma de dos números <b>reales</b> que se le pasan cómo paramentros, 
	 * y devuelve el resultado cómo <b>real</b>. Un real es cualquier número, con decimales o sin ellos.
	 * 
	 * @param n1 representa uno de los números a sumar.
	 * @param n2 representa el otro número a sumar.
	 * @return devuelve un <b>real</b> que es la suma de los parámetros <b>n1</b> y <b>n2</b>.
	 */
	public double sumaDosNumerosReales(double n1,double n2) {
		//TODO
		double resultado = 0;
		return resultado;
	}
		
	/**
	 *Método que realiza la suma de dos números <b>enteros</b> que se le pasan cómo paramentros, 
	 * y devuelve el resultado cómo <b>entero</b>. Un entero es un número sin decimales.
	 * 
	 * @param n1 representa uno de los números a sumar.
	 * @param n2 representa el otro número a sumar.
	 * @return devuelve un <b>entero</b> que es la suma de los parámetros <b>n1</b> y <b>n2</b>.
	 */
	public int sumaDosNumerosEnteros(int n1,int n2) {
		//TODO
		int resultado = 0;
		return resultado;
	}
	
	/**
	 *Método que realiza la suma de tres números <b>reales</b> que se le pasan cómo paramentros, 
	 * y devuelve el resultado cómo <b>real</b>. Un real es cualquier número, con decimales o sin ellos.
	 * 
	 * @param n1 representa uno de los números a sumar.
	 * @param n2 representa uno de los números a sumar.
	 * @param n3 representa uno de los números a sumar.
	 * @return devuelve un <b>real</b> que es la suma de los parámetros <b>n1</b> y <b>n2</b>.
	 */
	public double sumaTresNumerosReales(double n1,double n2, double n3) {
		//TODO
		double resultado = 0;
		return resultado;
	}
	
	/**
	 *Método que añade al valor de un contador cualquier número <b>real</b> que se le pasan cómo paramentro.
	 *El valor del contados se puede modificar con el setter <b>setEntero()</b> y obtener con el getter <b>getEntero()</b> . 
	 * 
	 * @param n1 representa el número que se quiere sumar al contador.
	 */
	public void sumaValorAcumulado(double n1) {
		//TODO
	}
	
}
