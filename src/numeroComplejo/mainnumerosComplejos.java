package numeroComplejo;

import java.util.Scanner;

public class mainnumerosComplejos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		numerosComplejos n1=new numerosComplejos(4,3);
		System.out.println(n1);
		numerosComplejos n2=new numerosComplejos(3,4);
		numerosComplejos n3 = n1.suma(n2);
		System.out.println("La suma es " + n3);
		numerosComplejos n4= n1.resta(n2);
		System.out.println("La resta es " +n4);
	}

}
