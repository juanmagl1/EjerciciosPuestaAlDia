package ejercicios;

public class pasaraBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroDecimal;
		numeroDecimal=150;
		System.out.println(binarioDecimal(numeroDecimal));
	}
	
	public static String binarioDecimal(int numero) {
		/*Nos creamos un nuevo stringBuilder, porque un string no vale 
		 * porque hay que sumarle cosas
		 */
		StringBuilder cad1=new StringBuilder();
		/* En el bucle funcionaria, mientras que el numero sea mayor que 2
		 * con el comando append va sumando el resto de 2 a la cadena mientras 
		 * dure el bucle, y después ya que divida otra vez entre 2
		 */
		while (numero>=2) {
			cad1.append(numero%2);
			numero=numero/2;
			
		}
		/*Cuando nos queda el ultimo numero se lo sumamos a la cadena, le damos la
		 * vuelta con el reverse y para pasarlo a cadena, lo pasamos con el toString
		 */
		cad1.append(numero);
		return cad1.reverse().toString();
	}
}
