package libreriaVirtual;

import java.util.ArrayList;


public class CarritoDeCompra  {
	
	ArrayList<ItemCarrito> items;
	
	public CarritoDeCompra() {
		
		this.items = new ArrayList<ItemCarrito>();
	}
		
		public void agregarItem(ItemCarrito ic) {
			this.items.add(ic);
		}

		public void quitarItem(ItemCarrito ic) {
			this.items.remove(ic);
		}
		
		public void mostrarItems() {
			
			System.out.println();
			System.out.println("CARRITO DE COMPRA:");
			
			for(ItemCarrito i : items) {
				
				if (i.isesFisico() == true) {
					System.out.println(i.getPublicacion().getTipoDeProducto() + ": " + i.getPublicacion().getTitulo() + ", cantidad: " + i.getCantidad() + ", formato: fisico, " + "precio total: " +i.getPrecioVenta() + " pesos");
				} else {
					System.out.println(i.getPublicacion().getTipoDeProducto() +  ": " + i.getPublicacion().getTitulo() + ", formato: digital, " + "precio total: " +i.getPrecioVenta() + " pesos");
				}
			}
			
			System.out.println();
			System.out.println("el total a pagar es de: " + calcularTotalAPagar() + " pesos");
			System.out.println();
			System.out.println("------------------------------------------------------------------");
			System.out.println();
		}
		
		
		public double calcularTotalAPagar() {
			
			double totalAPagar = 0;
			
			for (ItemCarrito i : items) {
				
				totalAPagar += i.getPrecioVenta();

			}
			
			return(Math.round(totalAPagar * 100.0) / 100.0);
			
		}
		
		

}

