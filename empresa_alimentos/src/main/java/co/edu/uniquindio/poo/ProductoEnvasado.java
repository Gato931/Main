package co.edu.uniquindio.poo;

public class ProductoEnvasado extends Producto {
	private String fechaEnvasado;
	private String pesoEnvasado;
	private PaisOrigen paisOrigen;

	public ProductoEnvasado(String codigo, String nombre, double precio, Proveedor proveedor, String fechaEnvasado,
			String pesoEnvasado, PaisOrigen paisOrigen) {
		super(codigo, nombre, precio, proveedor);
		this.fechaEnvasado = fechaEnvasado;
		this.pesoEnvasado = pesoEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPesoEnvasado() {
		return pesoEnvasado;
	}

	public void setPesoEnvasado(String pesoEnvasado) {
		this.pesoEnvasado = pesoEnvasado;
	}

	public PaisOrigen getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(PaisOrigen paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public double calcularUtilidad() {
		return getPrecio() + 1.35
	}

	@Override
	public double calcularImpuesto() {

	}

	@Override
	public String toString() {
		return "ProductosEnvasados [codigo=" + codigo + ", fechaEnvasado=" + fechaEnvasado + ", nombre=" + nombre
				+ ", precio=" + precio + ", pesoEnvasado=" + pesoEnvasado + ", proveedor=" + proveedor + ", paisOrigen="
				+ paisOrigen + "]";
	}
}
