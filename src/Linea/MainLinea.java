package Linea;

import java.util.Scanner;

public class MainLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Punto p1=new Punto(3,9);
		Punto p2=new Punto(2,4);
		Linea l1=new Linea(p1,p2);
		l1.moverArriba(4);
		System.out.println(l1);
	}

}
