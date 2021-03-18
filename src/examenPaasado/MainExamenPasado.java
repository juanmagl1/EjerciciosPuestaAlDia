package examenPaasado;

import java.util.Scanner;

public class MainExamenPasado {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		try {
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
				opcion=Integer.parseInt(teclado.nextLine());
				switch(opcion) {
				case 1:
					t1.getNumMensajes();
					System.out.println(t1.getNumMensajes());
					break;
				case 2:
					int numMensaje=0;
					System.out.println("¿Que mensaje quieres consultar?");
					numMensaje=Integer.parseInt(teclado.nextLine());
					int opcionHacer;
					if (numMensaje==1) {
						System.out.println("1.Oir " + "2.Borrar");
						opcionHacer=Integer.parseInt(teclado.nextLine());
						if(opcionHacer==1) {
							System.out.println(t1.getMensaje1());
							
						}else {
							t1.borrarUnMensaje(1);
						}
					}else if(numMensaje==2) {
						System.out.println("1.Oir " + "2.Borrar");
						opcionHacer=Integer.parseInt(teclado.nextLine());
						if (opcionHacer==1) {
							System.out.println(t1.getMensaje2());
						}else {
							t1.borrarUnMensaje(2);
						}
					}else if(numMensaje==3) {
						System.out.println("1.Oir " + "2.Borrar");
						opcionHacer=Integer.parseInt(teclado.nextLine());
						if(opcionHacer==1) {
							System.out.println(t1.getMensaje3());
						}else {
							t1.borrarUnMensaje(3);
						}break;
					} case 3:
						if(t1.getNumMensajes()==3) {
							throw new Exception("Buzon lleno");
							
						}
						String mensaje="";
						System.out.println("¿Que mensaje quieres añadir?");
						mensaje=teclado.nextLine();
						t1.enviarMensaje(mensaje);
						break;
					case 4:
						t1.borrarMensajes();
					case 5:
						break;
				} 
		}
		
			
		
	}
	
	catch(Exception telefono) {
		System.out.println(telefono.getMessage());
	}
	}
}
