package producto;

public class Producto {
	private static final double IVA=0.2;
	private String descripcion;
	private double precio;
	private int codigo;
	private static int codSig=1;
	public Producto(String descripcion, double precio) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codSig;
		this.codSig++;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Double PrecioconIva() {
		this.precio=precio;
		return precio+precio*IVA;
	}
	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo + "]";
	}
}
