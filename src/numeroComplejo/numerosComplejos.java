package numeroComplejo;

public class numerosComplejos {
private double preal;
private double pimaginaria;
public numerosComplejos(double preal, double pimaginaria) {
	super();
	this.preal = preal;
	this.pimaginaria = pimaginaria;
}

public numerosComplejos suma(numerosComplejos num) {
	double parteReal=this.preal+num.preal;
	double parteImaginaria=this.pimaginaria+num.pimaginaria;
	numerosComplejos resultado= new numerosComplejos(parteReal,parteImaginaria);
	return resultado;
}
public numerosComplejos resta(numerosComplejos num) {
	double parteReal=this.preal-num.preal;
	double parteImaginaria=this.pimaginaria-num.pimaginaria;
	numerosComplejos resultado= new numerosComplejos(parteReal,parteImaginaria);
	return resultado;
}

@Override
public String toString() {
	return "(" + preal + "," + pimaginaria + "i]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(pimaginaria);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(preal);
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
	numerosComplejos other = (numerosComplejos) obj;
	if (Double.doubleToLongBits(pimaginaria) != Double.doubleToLongBits(other.pimaginaria))
		return false;
	if (Double.doubleToLongBits(preal) != Double.doubleToLongBits(other.preal))
		return false;
	return true;
}

}
