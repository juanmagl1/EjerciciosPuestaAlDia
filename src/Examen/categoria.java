package Examen;

public class categoria {
private String nombreCategoria;
private final double precioPorMinuto=1.05;

public categoria(String nombreCategoria) {
	super();
	this.nombreCategoria = nombreCategoria;
}

public String getNombreCategoria() {
	return nombreCategoria;
}

public void setNombreCategoria(String nombreCategoria) {
	this.nombreCategoria = nombreCategoria;
}

public double getPrecioPorMinuto() {
	return precioPorMinuto;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nombreCategoria == null) ? 0 : nombreCategoria.hashCode());
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
	categoria other = (categoria) obj;
	if (nombreCategoria == null) {
		if (other.nombreCategoria != null)
			return false;
	} else if (!nombreCategoria.equals(other.nombreCategoria))
		return false;
	return true;
}

@Override
public String toString() {
	return "categoria [nombreCategoria=" + nombreCategoria + ", precioPorMinuto=" + precioPorMinuto + "]";
}


}
