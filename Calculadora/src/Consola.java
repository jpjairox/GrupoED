/**
 * Esta clase sirve para realizar todo tipo de operaciones con las clases suma, resta, producto y cociente.
 * @author Salvador, Carlos, ALberto, Jairo
 * @version 1.0
 */
public class Consola {
	public static void main (String args []) {
		/*-----SUMA-----*/
		System.out.println("-----SUMA-----");
		Suma s =new Suma();
		s.sumaDosNumerosReales(13.4234, 3534.2);
		s.sumaDosNumerosEnteros(4, 7);
		s.sumaTresNumerosReales(-5, 120, 3.14);
		s.setReal(6.12);
		s.sumaValorAcumulado(15.5);
		s.getReal();
		
		/*-----RESTA-----*/
		System.out.println("-----RESTA-----");
		Resta r=new Resta();
		System.out.println(r.restaEnteros(1, 2));
		System.out.println(r.resta2Reales(1.5, 2.8));
		System.out.println(r.resta3Reales(1.9, 2.7, 3.3));
		r.restaAcum(1);
		
		/*-----PRODUCTO-----*/
		System.out.println("-----PRODUCTO-----");
		Producto p=new Producto();
		System.out.println(p.dosNumerosEnteros(4, 3));
		
		/*-----COCIENTE-----*/
		System.out.println("-----COCIENTE-----");
        Cociente cociente1= new Cociente(0,0,0,0,0,0);
        cociente1.DivisionReales(0, 0);
        cociente1.DivisionEnteros(0, 0);
        cociente1.Inverso(0);
        cociente1.Raiz(0);
	}
}
