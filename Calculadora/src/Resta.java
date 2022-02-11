/**
 * Esta clase sirve para restar números enteros o reales por separado así como para añadir números reales a un acumulador.
 * @author Jairo
 * @version 1.0
 */
public class Resta {
	private int entero;
	private double real;
	
    public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}


	public Resta() {
	}

	public Resta(int entero, double real) {
		super();
		this.entero = entero;
		this.real = real;
	}

	/** 
     * Método para hacer la resta de dos números <b>reales</b>
     * @param num1 entrada primer número real a restar
     * @param num2 entrada segundo número real a restar
     * @return resultado real resta entre los dos números reales introducidos
     * 
     */
    public double resta2Reales(double num1,double num2) {
        double restaReal=num1-num2;
        return restaReal;
    }

    /**
     * Método para hacer la resta de dos números <b>enteros</b>
     * @param num1 entrada primer número entero a restar
     * @param num2 entrada segundo número entero a restar
     * @return resultado entero de la resta entre los dos números enteros introducidos
     * 
     */
    public int restaEnteros(int num1,int num2) {
        int restaEntero=num1-num2;
        return restaEntero;
    }

    /**
     * Método para hacer la resta de <b>tres<b> números <b>reales<b>
     * @param num1 entrada primer número real a restar
     * @param num2 entrada segundo número real a restar
     * @param num3 entrada tercer número real a restar
     * @return resultado real resta entre los dos números reales introducidos
     * 
     */
    public double resta3Reales(double num1,double num2,double num3) {
    	double restaReal=num1-num2-num3;
        return restaReal;
    }

    /**
     * Método para hacer la <b>resta con un valor acumulado<b>
     * @param num valor de entrada que se va restando al acumulado
     * @param acumulado es la variable que guarda el valor acumulado 
     */
    public void restaAcum(double num) {
    	double acumulado=0;
    	while (acumulado>-10) {
            acumulado=acumulado-num;
    	}
    	System.out.println(acumulado);
    }
    
	  
}

