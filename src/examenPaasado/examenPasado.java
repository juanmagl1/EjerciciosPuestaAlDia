package examenPaasado;

public class examenPasado {
private int numMensajes=0;
private String mensaje1=" ";
private String mensaje2=" ";
private String mensaje3=" ";
public examenPasado() {
	super();
	
}
public int getNumMensajes() {
	return numMensajes;
}
public void setNumMensajes(int numMensajes) {
	this.numMensajes = numMensajes;
}
public String getMensaje1() {
	return mensaje1;
}
public void setMensaje1(String mensaje1) {
	this.mensaje1 = mensaje1;
}
public String getMensaje2() {
	return mensaje2;
}
public void setMensaje2(String mensaje2) {
	this.mensaje2 = mensaje2;
}
public String getMensaje3() {
	return mensaje3;
}
public void setMensaje3(String mensaje3) {
	this.mensaje3 = mensaje3;
}
public int enviarMensaje(String mensaje) throws Exception{
	if(numMensajes==3) {
		throw new Exception("Buzón lleno, no permite más mensajes");
	}
	
	if (numMensajes==0) {
		this.mensaje1=mensaje1;
		numMensajes++;
		
	}else if(numMensajes==1) {
		this.mensaje2=mensaje2;
		numMensajes++;
	}else if (numMensajes==2) {
		this.mensaje3=mensaje3;
		numMensajes++;
	}
	return numMensajes;
}
public void borrarMensajes() {
	numMensajes=0;
	this.mensaje1="";
	this.mensaje2="";
	this.mensaje3="";
	
}
public void borrarUnMensaje(int mensaje)throws Exception {
	if (numMensajes<0 || numMensajes>3) {
		throw new Exception("Opcion no valida");
	}
	switch(mensaje) {
	case 1:
		this.mensaje1="";
		break;
	case 2:
		this.mensaje2="";
		break;
	case 3:
		this.mensaje3="";
		break;
		
	}
	this.numMensajes--;
}
@Override
public String toString() {
	return "examenPasado [numMensajes=" + numMensajes + ", mensaje1=" + mensaje1 + ", mensaje2=" + mensaje2
			+ ", mensaje3=" + mensaje3 + "]";
}
}
