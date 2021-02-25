package ejercicios;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	public Persona(String nombre, String apellido, int edad, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	public String getTelefono() {
		return telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ "]";
	}
	
	

}
