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

}
