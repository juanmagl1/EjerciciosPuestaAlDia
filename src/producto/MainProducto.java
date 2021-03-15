package producto;

import java.util.Scanner;

public class MainProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Producto p1=new Producto("Piña",33);
		System.out.println(p1);
		Producto p2 = new Producto("Atún",4.5);
		p2.PrecioconIva();
		System.out.println(p2);
		
	}

}
