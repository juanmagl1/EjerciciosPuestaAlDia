package Examen;

public class parking {
private String nombreParking;
private int numeroTotalPlazas;
private categoria categoria;
private int numeroPlazasOcupadas;
private double recaudacion;
private int codigo;
private static int codSiguiente=1;
public parking(String nombreParking, int numeroTotalPlazas, Examen.categoria categoria,
		int codigo)throws Exception {
	super();
	if(numeroTotalPlazas<0) {
		throw new Exception("No se permiten plazas negativas");
	}
	this.nombreParking = nombreParking;
	this.numeroTotalPlazas = numeroTotalPlazas;
	this.categoria = categoria;
	this.codigo = codSiguiente;
	codSiguiente++;
}

public String getNombreParking() {
	return nombreParking;
}
private void setNombreParking(String nombreParking) {
	this.nombreParking = nombreParking;
}
public int getNumeroTotalPlazas() {
	return numeroTotalPlazas;
}
private void setNumeroTotalPlazas(int numeroTotalPlazas) {
	this.numeroTotalPlazas = numeroTotalPlazas;
}
public categoria getCategoria() {
	return categoria;
}
private void setCategoria(categoria categoria) {
	this.categoria = categoria;
}
public int getNumeroPlazasOcupadas() {
	return numeroPlazasOcupadas;
}
private void setNumeroPlazasOcupadas(int numeroPlazasOcupadas) {
	this.numeroPlazasOcupadas = numeroPlazasOcupadas;
}
public double getRecaudacion() {
	return recaudacion;
}
private void setRecaudacion(int recaudacion) {
	this.recaudacion = recaudacion;
}
public int getCodigo() {
	return codigo;
}
private void setCodigo(int codigo) {
	this.codigo = codigo;
}
public static int getCodSiguiente() {
	return codSiguiente;
}
private static void setCodSiguiente(int codSiguiente) {
	parking.codSiguiente = codSiguiente;
}
public double cobrarYsalirDelParking(int numeroMinutos) throws Exception {
	if (numeroMinutos<0) {
		throw new Exception("Los minutos tienen que ser positivos");
	}
	this.numeroPlazasOcupadas--;
	double recoger= numeroMinutos*this.categoria.getPrecioPorMinuto();
	this.recaudacion=recaudacion+recoger;
	return recoger;
}
public void entrarParking() throws Exception{
	if(this.numeroPlazasOcupadas>this.numeroTotalPlazas) {
		throw new Exception("Parking lleno, busquese otro parking");
	}
	this.numeroPlazasOcupadas++;
}




@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
	result = prime * result + codigo;
	result = prime * result + ((nombreParking == null) ? 0 : nombreParking.hashCode());
	result = prime * result + numeroPlazasOcupadas;
	result = prime * result + numeroTotalPlazas;
	long temp;
	temp = Double.doubleToLongBits(recaudacion);
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
	parking other = (parking) obj;
	if (categoria == null) {
		if (other.categoria != null)
			return false;
	} else if (!categoria.equals(other.categoria))
		return false;
	if (codigo != other.codigo)
		return false;
	if (nombreParking == null) {
		if (other.nombreParking != null)
			return false;
	} else if (!nombreParking.equals(other.nombreParking))
		return false;
	if (numeroPlazasOcupadas != other.numeroPlazasOcupadas)
		return false;
	if (numeroTotalPlazas != other.numeroTotalPlazas)
		return false;
	if (Double.doubleToLongBits(recaudacion) != Double.doubleToLongBits(other.recaudacion))
		return false;
	return true;
}

@Override
public String toString() {
	return "parking [nombreParking=" + nombreParking + ", numeroTotalPlazas=" + numeroTotalPlazas + ", categoria="
			+ categoria + ", numeroPlazasOcupadas=" + numeroPlazasOcupadas + ", recaudacion=" + recaudacion
			+ ", codigo=" + codigo + "]";
}


}
