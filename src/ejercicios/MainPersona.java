package ejercicios;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		Persona juanma = new Persona("Juanma","Garcia",26,"665274802");
		System.out.println(juanma);
		
		Persona Poperez = new Persona ("Hermenegildo","Perez",18,"954897562");
		System.out.println(Poperez);
		
		Persona Lele = new Persona ("Juan","Pastor",18,"55521489");
		System.out.println(Lele);
		
		String resultado = juanma.getNombre()+ Poperez.getApellido()+ Lele.getApellido();
		System.out.println(resultado);
		
	}

}
