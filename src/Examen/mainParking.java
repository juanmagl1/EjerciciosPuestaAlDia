package Examen;

import java.util.Scanner;

public class mainParking {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		try {
			categoria c1=new categoria("Alta");
			parking p1=new parking("Brenes",30,c1,1);
			System.out.println(p1);
			int opcion=0;
			while(opcion!=4) {
				System.out.println("1.- Entrar al parking."
						+ "2.- Salir de parking."
						+ "3.- Mostrar información del parking."
						+ "4.- Salir del programa");
				System.out.println("Que quieres hacer");
				opcion=Integer.parseInt(teclado.nextLine());
				switch(opcion) {
				case 1:
					p1.entrarParking();
					break;
				case 2:
					System.out.println("Cuantos minutos ha estado en el parking");
					int numeroMinutos;
					numeroMinutos=Integer.parseInt(teclado.nextLine());
					p1.cobrarYsalirDelParking(numeroMinutos);
					break;
				case 3:
					System.out.println(p1);
					break;
				case 4:
					break;
					
				}
			}
		}
				catch (Exception parking) {
					System.out.println(parking.getMessage());
				}
			}
		}
	


