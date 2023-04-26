package libreriaVirtual;

public class Revista extends Publicacion   {
	
	//revistas, tiene todo menos autor y editorial.
	public Revista(String titulo, int anioDePublicacion, int mesDePublicacion, int diaDePublicacion, String codigo, double precio, String tipoDeProducto) {
	    super(titulo, anioDePublicacion, mesDePublicacion, diaDePublicacion, codigo, precio,tipoDeProducto );
	}

}
