package examenPaasado;

import java.util.Scanner;

public class MainExamenPasado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		examenPasado t1= new examenPasado();
		System.out.println(t1);
		int opcion;
		opcion=0;
		while(opcion!=5) {
			System.out.println("1. Consultar número de mensajes"
					+ "\n"+ "2. Consultar mensaje"
					+ "\n"+"1. Mensaje número 1"+
					"\n"+"1 para oir 2 para borrar"+
					"\n"+"2. Mensaje número 2"+
					"\n"+"1 para oir 2 para borrar"+
					"\n"+"3. Mensaje número 3"+
					"\n"+"1 para oir 2 para borrar"+
					"\n"+"3.- Añadir mensaje"+
					"\n"+"4. Borrar todos los mensajes"+
					"n"+"5. Salir");
			System.out.println("¿Que desea hacer?");
		}
	}

}
