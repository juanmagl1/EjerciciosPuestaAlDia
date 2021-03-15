package Linea;

import java.util.Scanner;

public class MainLinea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Creamos la primera linea, Introduce la primera coordenada");
		double x1=Double.parseDouble(teclado.nextLine());
		System.out.println("Creamos la segunda corrdenada");
		double y1=Double.parseDouble(teclado.nextLine());
		Punto p1 = new Punto (x1,y1);
		System.out.println("Creamos el segundo punto, Introduce la primera coordenada");
		double x2=Double.parseDouble(teclado.nextLine());
		System.out.println("Introduce la segunda");
		Double y2= Double.parseDouble(teclado.nextLine());
		Punto p2=new Punto (x2,y2);
		Linea l1=new Linea(p1,p2);
		int opcion;
		System.out.println("1.Mover   línea:   Solicitará   el   movimiento   (A-arriba,   B-ABajo,   I-Izquierda,   D-Derecha) y realice el movimiento2.Mostrar línea3.Salir");
		opcion=Integer.parseInt(teclado.nextLine());
		switch(opcion) {
		case 1:
			char movimiento;
			System.out.println("Que movimiento quieres hacer");
			movimiento=teclado.nextLine().charAt(0);
			if(movimiento=='A') {
				System.out.println("Numero de cuadrados que quieres mover");
				Double cantidad;
				cantidad=Double.parseDouble(teclado.nextLine());
				l1.moverArriba(cantidad);
				System.out.println(l1);
			}else if(movimiento=='B'){
				System.out.println("Numero de movimientos que quieres hacer hacia Abajo");
				Double cantidad;
				cantidad=Double.parseDouble(teclado.nextLine());
				l1.moverDebajo(cantidad);
				System.out.println(l1);
			}else if (movimiento=='I') {
				System.out.println("Movimiento que quiere realizar hacia la izquierda");
				Double cantidad;
				cantidad=Double.parseDouble(teclado.nextLine());
				l1.moverIzquierda(cantidad);
				System.out.println(l1);
			}else if (movimiento=='D') {
				System.out.println("Numero de movimientos que quieres hacer");
				Double cantidad;
				cantidad=Double.parseDouble(teclado.nextLine());
				l1.moverDerecha(cantidad);
				System.out.println(l1);
				break;
			}
		case 2:
			System.out.println(l1);
			break;
		case 3:
			break;
		}
	}

}
