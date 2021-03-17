package ejercicios;

import java.util.Scanner;

public class ejercicioCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String numeroBinario;
		numeroBinario="11111111";
		System.out.println(decimalbinario(numeroBinario));
		
		
	}
	public static double decimalbinario(String Cadena) { /*Creamos el metodo para hacer 
	el calculo mediante las clases de java*/
		
		StringBuilder n1=new StringBuilder(Cadena);
		
		//Con esta operacion le damos la vuelta a la cadena
		n1=n1.reverse();
		double cont=0;
		double result=0;
		/*Con este for lo que queremos saber esque si cuando lee la cadena
		 * el caracter es un '1', lo que hacemos es que eleve al numero que
		 * está el contador por ekemplo 2 elevado a 1 y que guarde ese 1 y sume
		 * el siguiente valor, y si el caracter es un 0 pues que siga leyendo y
		 * al final que nos returne el contador 
		 */
		for (int i=0;i<n1.length();i++) {
			if(n1.charAt(i)=='1') {
				result=result+Math.pow(2.0, cont);
			cont++;
			}else {
				cont++;
			}
		}
		return result;
	}
	
	
}
