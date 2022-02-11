/* 
 * Esta clase es para hacer operaciones como divisiones con numeros reales y enteros,
 * inversos de un numero y raices cuadradas
 * @author Alberto
 * @version 1.0
 */
public class Cociente {
	
	/* Esta clase es para hacer operaciones como divisiones con numeros reales y enteros,
	 * inversos de un numero y raices cuadradas
	 * @author Alberto
	 * @version 1.0
	 */
	    /* Primer numero real para el cociente con reales (Divisor)
	     */
	    private float real1;
	    /* Segundo numero real para el cociente con reales (Dividendo)
	     */
	    private float real2;
	    /* Primer numero real para el cociente con enteros (Divisor)
	     */
	    private int ent1;
	    /* Segundo numero real para el cociente con enteros (Dividendo)
	     */
	    private int ent2;
	    /* Numero real para calcular el inverso de ese numero
	     */
	    private float inv1;
	    /* Numero real para calcular la raiz de ese numero
	     */
	    private float raiz1;

	    /** 
	     * Metodo constructor que recibe parametros
	     * @param real1 Representa el primer numero real para el cociente de numeros reales (Divisor)
	     * @param real2 Representa el segundo numero real para el cociente de numeros reales (Dividendo)
	     * @param ent1 Representa el primer numero real para el cociente de numeros enteros (Divisor)
	     * @param ent2 Representa el segundo numero real para el cociente de numeros enteros (Dividendo)
	     * @param inv1 Representa el numero para calcular el inverso de ese numero
	     * @param raiz1 Representa el numero para calcular la raiz de ese numero
	     */

	    public Cociente(float real1, float real2, int ent1, int ent2, float inv1, float raiz1) {
	        this.real1=real1;
	        this.real2=real2;
	        this.ent1=ent1;
	        this.inv1=inv1;
	        this.raiz1=raiz1;
	    }

	    /** 
	     * Metodo para resolver el cociente de numeros reales 
	     * Casos especiales: Si el segundo numero a dividir (Dividendo) es 0, no se podria hacer ya que daria una indeterminacion.
	     * Si la division no da un numero exacto
	     * @param real1 Representa el primer numero real para la division (Divisor)
	     * @param real2 Representa el segundo numero real para la division (Dividendo)
	     * @return resultado Representa el resulado del cociente de reales
	     */

	    public float DivisionReales(float real2, float real1) {
	        float resultado=0;
	        return resultado;
	    }

	    /**
	     *  Metodo para resolver el cociente de numeros enteros
	     * Casos especiales: Si el segundo numero a dividir (Dividendo) es 0, no se podria hacer ya que daria una indeterminacion
	     * Si la division da como resultado un numero que no es exacto se hariaa una aproximacion al numero entero mas proximo
	     * @param ent1 Representa el primer numero entero para el cociente de enteros (Divisor)
	     * @param ent2 Representa el segundo numero entero para el cociente de enteros (Dividendo)
	     * @return resultado Representa el resulado del cociente de reales
	     */

	    public int DivisionEnteros(int ent1, int ent2) {
	        int resultado=0;
	        return resultado;

	    }

	    /**
	     * Metodo para calcular el inverso de un numero
	     * Casos especiales: Si el numero introducido es 0 el resultado sera 0 ya que no tiene numero inverso
	     * Si el numero introducido es negativo el resultado sera negativo y si es positivo sera positivo
	     * @param inv1 Representa el numero para calcular el inverso de ese numero
	     * @return resultado Representa el resulado del inverso de ese numero
	     */

	    public float Inverso(float inv1) {
	        float resultado=0;
	        return resultado;
	    }
	    /**
	     * Metodo para calcular la raiz cuadrada de un numero
	     * Casos especiales: Si el numero introducido es 0 el resultado sera 0
	     * Si el numero introducido es negativo no se podra calcular ya que el resultado no es un numero real
	     * @param raiz1 Representa el numero para calcular la raiz cuadrada de ese numero
	     * @return resultado Representa el resulado de la raiz cuadrada de ese numero
	     */

	    public float Raiz(int raiz1) {
	        float resultado=0;
	        return resultado;
	    }

}

