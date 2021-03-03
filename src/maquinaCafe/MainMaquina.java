package maquinaCafe;

import java.util.Scanner;

public class MainMaquina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		try {
			Maquina m1=new Maquina(50);
			System.out.println(m1);
			int opcion=0;
			while(opcion<6) {
				System.out.println("1.Servir café solo (1 euro) "
						+ "2.Servir leche (0,8 euros)"
						+ "3.Servir café con leche (1,5 euros)"
						+ "4.Consultar   estado   máquina.   Aparecen   los   datos   de   los   depósitos   y   delmonedero"
						+ "5.Apagar máquina");
				System.out.println("Introduce una opcion");
				opcion=Integer.parseInt(teclado.nextLine());
				switch(opcion) {
				case 1:
					double cantidad;
					System.out.println("Introduce una cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					m1.servirCafe(cantidad);
					break;
				case 2:
					System.out.println("Introduce una cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					m1.servirLeche(cantidad);
					break;
				case 3:
					System.out.println("Introduce una cantidad");
					cantidad=Double.parseDouble(teclado.nextLine());
					m1.servirCafeconLeche(cantidad);
					break;
				case 4:
					System.out.println(m1);
					System.out.println(m1.getDepopsitoCafe());
					System.out.println(m1.getDepositoLeche());
					System.out.println(m1.getDepositoVasos());
					break;
				case 5:
					break;
				}	}
			}
			catch(Exception cafe) {
				System.out.println(cafe.getMessage());
			}

	}
}
