package ejercicios;

public class Cuenta {
private double saldo;
private int numreintegro;
private int numingreso;
private String numcuenta;
public Cuenta(double saldo, String numcuenta) throws Exception {
	super();
	if(saldo<0) {
		throw new Exception();
	}else {
		this.saldo = saldo;
		this.numingreso=1;
	}
	this.numcuenta = numcuenta;
}
public double getSaldo() {
	return saldo;
}
public int getNumreintegro() {
	return numreintegro;
	
}
public int getNumingreso() {
	
	return numingreso;
}
public String getNumcuenta() {
	return numcuenta;
}
public void ingreso(double cantidad) {
	this.saldo=saldo+cantidad;
	this.numingreso++;
}
public void reintegro(double cantidad) {
	this.saldo=saldo-cantidad;
	this.numreintegro++;
}
@Override
public String toString() {
	return "Cuenta [saldo=" + saldo + ", numreintegro=" + numreintegro + ", numingreso=" + numingreso + ", numcuenta="
			+ numcuenta + "]";
}

}
