package ejercicios;

import java.util.Scanner;

public class mainPrincipal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		try{
			Cuenta c1=new Cuenta(600,"0021254");
			System.out.println(c1);
			int opcion=0;
			char salir='N';
			while(opcion<5 && salir=='N') {
				System.out.println("(\"1.Hacer un reintegro\"\n" + 
						"				\" 2.Hacer un ingreso\"\n" + 
						"				\" 3.Consultar el saldo y el número de reintegros\"\n" + 
						"				\" 4.Finalizar las operaciones.\");");
				System.out.println("Elija una opcion");
				opcion=(teclado.nextInt());
				switch(opcion){
				 case 1:
					double cantidad;
					System.out.println("Introduzca una cantidad");
					cantidad=teclado.nextInt();
					c1.reintegro(cantidad);
					break;
				 case 2:
					System.out.println("Introduzca una cantidad");
					cantidad=teclado.nextInt();
					c1.ingreso(cantidad);
					break;
				 case 3:
					 System.out.println(c1.getSaldo());
					 System.out.println(c1.getNumingreso());
					 System.out.println(c1.getNumreintegro());
					 break;
				 case 4:
					 System.out.println("¿Quiere salir?");
					 salir=teclado.nextLine().charAt(0);
					 if (salir!='N') {
						 break;
					 }
					 
					 
					
				}		
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
		