package Linea;

public class Punto {
private double coodenadaX;
private double coordenadaY;

public Punto(double coodenadaX, double coordenadaY) {
	super();
	this.coodenadaX = coodenadaX;
	this.coordenadaY = coordenadaY;
}

public Punto() {
	super();
	this.coodenadaX = (0.0);
	this.coordenadaY = (0.0);
}

public double getCoodenadaX() {
	return coodenadaX;
}

public void setCoodenadaX(double coodenadaX) {
	this.coodenadaX = coodenadaX;
}

public double getCoordenadaY() {
	return coordenadaY;
}

public void setCoordenadaY(double coordenadaY) {
	this.coordenadaY = coordenadaY;
}

@Override
public String toString() {
	return "Linea [coodenadaX=" + coodenadaX + ", coordenadaY=" + coordenadaY + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(coodenadaX);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(coordenadaY);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Punto other = (Punto) obj;
	if (Double.doubleToLongBits(coodenadaX) != Double.doubleToLongBits(other.coodenadaX))
		return false;
	if (Double.doubleToLongBits(coordenadaY) != Double.doubleToLongBits(other.coordenadaY))
		return false;
	return true;
}

}
