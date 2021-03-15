package examenPaasado;

public class examenPasado {
private int numMensajes=0;
private String mensaje1=" ";
private String mensaje2=" ";
private String mensaje3=" ";
public examenPasado(int numMensajes, String mensaje1, String mensaje2, String mensaje3) {
	super();
	this.numMensajes = numMensajes;
	this.mensaje1 = mensaje1;
	this.mensaje2 = mensaje2;
	this.mensaje3 = mensaje3;
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
public int enviarMensaje(String mensaje) {
	if (numMensajes==0) {
		System.out.println("Introduce el mensaje");
		mensaje1=teclado.nextLine();
		numMensajes++;
		
	}else if(numMensajes==1) {
		System.out.println("Introduce el mensaje");
		numMensajes++;
	}else if (numMensajes==2) {
		System.out.println("Introduce el mensaje");
		numMensajes++;
	}else {
		System.out.println("Buzón lleno no permite mas mensajes");
	}
	return numMensajes;
}
}
