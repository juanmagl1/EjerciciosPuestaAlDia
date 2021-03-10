package Linea;

public class Linea {
private Punto lineaA;
private Punto lineaB;

public Linea(Punto lineaA, Punto lineaB) {
	super();
	this.lineaA = lineaA;
	this.lineaB = lineaB;
}

public Linea() {
	super();
	this.lineaA=new Punto(0,0);
	this.lineaB= new Punto(0,0);
}

public Punto getLineaA() {
	return lineaA;
}

public void setLineaA(Punto lineaA) {
	this.lineaA = lineaA;
}

public Punto getLineaB() {
	return lineaB;
}

public void setLineaB(Punto lineaB) {
	this.lineaB = lineaB;
}
public void moverDerecha(double numeroX) {
		this.lineaA.setCoodenadaX(numeroX+this.lineaA.getCoodenadaX());
		this.lineaB.setCoodenadaX(numeroX+this.lineaB.getCoodenadaX());
}
public void moverIzquierda(double numeroX) {
		this.lineaA.setCoodenadaX(numeroX-this.lineaA.getCoodenadaX());
		this.lineaB.setCoodenadaX(numeroX-this.lineaB.getCoodenadaX());
		
}
public void moverArriba(double numeroY) {
	this.lineaA.setCoordenadaY(numeroY+this.lineaA.getCoordenadaY());
	this.lineaB.setCoordenadaY(numeroY+this.lineaB.getCoordenadaY());
}
public void moverDebajo(double numeroY) {
	this.lineaA.setCoordenadaY(numeroY-this.lineaA.getCoordenadaY());
	this.lineaB.setCoordenadaY(numeroY-this.lineaB.getCoordenadaY());
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((lineaA == null) ? 0 : lineaA.hashCode());
	result = prime * result + ((lineaB == null) ? 0 : lineaB.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Linea other = (Linea) obj;
	if (lineaA == null) {
		if (other.lineaA != null)
			return false;
	} else if (!lineaA.equals(other.lineaA))
		return false;
	if (lineaB == null) {
		if (other.lineaB != null)
			return false;
	} else if (!lineaB.equals(other.lineaB))
		return false;
	return true;
}

@Override
public String toString() {
	return "Linea [lineaA=" + lineaA + ", lineaB=" + lineaB + "]";
}
}

