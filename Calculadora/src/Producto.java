/**
 * Esta clase sirve para hacer multiplicaciones tanto de 2 números enteros, como de 2 o 3 números reales, y para hacer potencias.
 * @author Carlos Otazo
 * @version 1.0
 */

public class Producto {
	
	    /** 
	     * Método que calcula el resultado de la multiplicación de 2 números reales.
	     * @param real1 representa el valor del primer número introducido, el que será multiplicado.
	     * @param real2 representa el valor del segundo número introducido, es decir el que multiplicará.
	     * @return el resultado de la multiplicación de ambos números. 
	     * <b>Caso especial:</b> Cualquier número multiplicado por 0 da como resultado 0.
	     */
	    public double dosNumerosReales(double real1, double real2){
	     return (real1*real2);
	    }
	    /** 
	     * Método que calcula el resultado de la multiplicación de 2 números enteros.
	     * @param entero1 representa el valor del primer número introducido, el que será multiplicado.
	     * @param entero2 representa el valor del segundo número introducido, es decir el que multiplicará.
	     * @return el resultado de la multiplicación de ambos números.
	     * <b>Caso especial</b>: Cualquier número multiplicado por 0 da como resultado 0.
	     */
	    public int dosNumerosEnteros(int entero1, int entero2){
	     return (entero1*entero2);
	    }
	    /** 
	     * Método que calcula el resultado de la multiplicación de 3 números reales.
	     * @param real1 representa el valor del primer número introducido, el que será multiplicado.
	     * @param real2 representa el valor del segundo número introducido, es decir el primero que multiplicará.
	     * @param real3 representa el valor del tercer número introducido, es decir el segundo que multiplicará.
	     * @return el resultado de la multiplicación de los tres números.
	     * <b>Caso especial:</b> Cualquier número multiplicado por 0 da como resultado 0.
	     */
	    public double tresNumerosreales(double real1, double real2, double real3){
	     return (real1*real2*real3);
	    }
	    /**
	     * Método que calcula la potencia del número ingresado como base.
	     * @param base representa el valor del número a multiplicar.
	     * @param exponente representa el valor del número de veces que se multiplicará la base por si misma.
	     * @return el resultado de elevar la base al número ingresado como exponente.
	     * <b>Caso especial:</b> En caso de que los números ingresados sean mas grandes que el tipo de dato, no se podría realizar la potencia.
	     */
	    public int potencia(int base, int exponente){
	     if (base == 0)
	        return 1;
	     else
	        return base * potencia(base, exponente - 1);
	    }
}

