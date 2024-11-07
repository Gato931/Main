package co.edu.uniquindio.poo;

public class ProductoPerecedero extends Producto{
  private String fechaVencimiento;

  public ProductoPerecedero(String codigo, String nombre, double precio, Proveedor proveedor) {
    super(codigo, nombre, precio, proveedor);
  }

  public String getFechaVencimiento() {
    return fechaVencimiento;
  }


  public void setFechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }
  @Override
  public double calcularUtilidad(){
    double total = producto.getPrecio() + (300 * producto.getPesoEnvasado());
    return total;
  }
  @Override
  public double calcularImpuesto(){

  }
}