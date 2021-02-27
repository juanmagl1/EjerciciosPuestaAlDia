package ejercicios;

public class Rectangulo {
private double longitud;
private double ancho;

public Rectangulo(double longitud, double ancho) {
	super();
//	this.longitud = setLongitud(longitud);
//	this.ancho = setAncho(ancho);
	/* Asi no se hace porque no hace falta ponerlo se le puede llamar usando el 
	 * this.y el nombre de la funcion no hace falta el signo de igual
	 */
	this.setLongitud(longitud);
	this.setAncho(ancho);
	
	
}

public double getLongitud() {
	return longitud;
}

public void setLongitud(double longitud) {
	if (longitud<0 || longitud<20) {
		this.longitud=longitud;
	}else {
		 this.longitud=1;
	}
}

public double getAncho() {
	return ancho;
}

public void setAncho(double ancho) {
	if (ancho<0 || ancho<20) {
		this.ancho=ancho;
	}else {
		 this.ancho=1;
	}
}
public static double area(double longitud, double ancho) {
	return ancho*longitud;
}
public static double perimetro(double longitud,double ancho) {
	return (longitud*2)+(ancho*2);
}

@Override
public String toString() {
	return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
}


















}
