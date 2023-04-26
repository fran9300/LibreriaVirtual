package libreriaVirtual;

public class ItemCarrito {
	
	//items del carrito, con su:  libro o revista, cantidad deseada, fisico o no y el precio de venta (que se calcula con un metodo de la itnerfaz venta)
	private Publicacion publicacion;
	private int cantidad;
	private boolean esFisico;
	private double precioVenta;
	
	public ItemCarrito(Publicacion publicacion, int cantidad, boolean esFisico) {
		this.setPublicacion(publicacion);
		this.setCantidad(cantidad);
		this.setesFisico(esFisico);
		this.calcularPrecioVenta();
	}
	
	public ItemCarrito(Publicacion publicacion, boolean esFisico) {
		this.setPublicacion(publicacion);
		this.setesFisico(esFisico);
		this.calcularPrecioVenta();
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isesFisico() {
		return esFisico;
	}

	public void setesFisico(boolean fisico) {
		this.esFisico = fisico;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	//calcular el precio segun si es libro o reista, y si es fisico o digital. al final se usa Math.round para redondear el valor
	public void calcularPrecioVenta() {
		
		double valorActualizado;
		if(this.publicacion instanceof Libro) valorActualizado = esFisico ? this.publicacion.getPrecio() * 1.18 * this.getCantidad() : this.publicacion.getPrecio() * 1.08;
		else valorActualizado = esFisico ? this.publicacion.getPrecio() * 1.22 * this.getCantidad() : this.publicacion.getPrecio() * 1.12;
		
		this.setPrecioVenta(Math.round(valorActualizado * 100.0) / 100.0); //redondeo el valor, para que muestr solo dos numeros despues de la coma.
	}

	

	


}
