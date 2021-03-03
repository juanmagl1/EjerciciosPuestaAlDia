package maquinaCafe;

public class Maquina {
private final int maximo_cafe=50;
private final int maximo_leche=50;
private final int maximo_vasos=50;
private final double precio_cafe=1.0;
private final double precio_leche=0.8;
private final double precio_cafe_con_leche=1.5;
private int depopsitoCafe;
private int depositoLeche;
private int depositoVasos;
private double monedero;
public Maquina(double monedero)throws Exception {
	super();
	this.depopsitoCafe = maximo_cafe;
	this.depositoLeche = maximo_leche;
	this.depositoVasos = maximo_vasos;
	if(monedero<0) {
		throw new Exception("Introduzca un saldo positivo");
	}else {
		this.monedero = monedero;

	}
}
public void llenarDepositos(int depopsitoCafe,int depositoLeche, int depositoVasos) {
	this.depopsitoCafe = maximo_cafe;
	this.depositoLeche = maximo_leche;
	this.depositoVasos = maximo_vasos;
}
public int getDepopsitoCafe() {
	return depopsitoCafe;
}
public int getDepositoLeche() {
	return depositoLeche;
}
public int getDepositoVasos() {
	return depositoVasos;
}
public void setMonedero(double monedero) {
	this.monedero = monedero;
}
public double servirCafe(double dinero) throws Exception {
	if (dinero+precio_cafe>monedero) {
		throw new Exception("Intorduce dinero mas pequeño");
	}else if(depositoVasos<1) {
		throw new Exception("hay que rellenar los vasos");
	}else if(depopsitoCafe<1) {
		throw new Exception("Hay que rellenar el café");
	}else if (dinero<precio_cafe) {
		throw new Exception("Error el precio del cafe es" + this.precio_cafe);
	}
	else {
		this.monedero=monedero+dinero;
		this.depopsitoCafe--;
		
	}return dinero-precio_cafe;

}
public double servirLeche(double dinero) throws Exception {
	if (dinero+precio_leche>monedero) {
		throw new Exception("Intorduce dinero mas pequeño");
	}else if(depositoVasos<1) {
		throw new Exception("hay que rellenar los vasos");
	}else if(depositoLeche<1) {
		throw new Exception("Hay que rellenar el café");
	}else if (dinero<precio_cafe) {
		throw new Exception("Error el precio de la leche es" + this.precio_leche);
	}
	else {
		this.monedero=monedero+dinero;
		this.depositoLeche--;
	}
	
	return dinero-precio_leche;
}
public double servirCafeconLeche(double dinero)throws Exception{
	if (dinero+precio_cafe_con_leche>monedero) {
		throw new Exception("Intorduce dinero mas pequeño");
	}else if(depositoVasos<1) {
		throw new Exception("hay que rellenar los vasos");
	}else if(depositoLeche<1) {
		throw new Exception("Hay que rellenar la leche");
	}else if (depopsitoCafe<1) {
		throw new Exception("Hay que rellenar el café");

	}else if (dinero<precio_cafe) {
		throw new Exception("Error el precio del cafe con leche es" + this.precio_cafe_con_leche);
	}
	else {
		this.monedero=monedero+dinero;
		this.depopsitoCafe--;
		this.depositoLeche--;
	}
	
	return dinero - precio_cafe_con_leche;
}
@Override
public String toString() {
	return "Maquina [precio_cafe=" + precio_cafe + ", precio_leche=" + precio_leche + ", precio_cafe_con_leche="
			+ precio_cafe_con_leche + ", depopsitoCafe=" + depopsitoCafe + ", depositoLeche=" + depositoLeche
			+ ", depositoVasos=" + depositoVasos + ", monedero=" + monedero + "]";
}
}
