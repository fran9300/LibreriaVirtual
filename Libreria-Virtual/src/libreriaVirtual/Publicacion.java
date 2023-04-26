package libreriaVirtual;

import java.time.LocalDate;

public abstract class Publicacion {
	
	//clase padre de libro y revista, con su metodo para mostrar los datos de un libro o revista.
	
	private String titulo;
	private int anioDePublicacion;
	private int mesDePublicacion;
	private int diaDePublicacion;
	private String codigo;
	private double precio;
	private String autor;
	private String editorial;
	private String tipoDeProducto;
	private LocalDate fechaDePublicacion;
	
	
    public Publicacion(String titulo, int anioDePublicacion, int mesDePublicacion, int diaDePublicacion, String codigo, double precio, String autor, String editorial, String tipoDeProducto) {
        

    	this.setTitulo(titulo);
        this.setAnioDePublicacion(anioDePublicacion);
        this.setMesDePublicacion(mesDePublicacion);
        this.setDiaDePublicacion(diaDePublicacion);
        this.setCodigo(codigo);
        this.setPrecio(precio);
        this.setAutor(autor);
	    this.setEditorial(editorial);
	    this.setTipoDeProducto(tipoDeProducto);
	    this.setFechaDePublicacion(LocalDate.of(anioDePublicacion, mesDePublicacion, diaDePublicacion));
	    
	    
    }
    
    public Publicacion(String titulo, int anioDePublicacion, int mesDePublicacion, int diaDePublicacion, String codigo, double precio, String tipoDeProducto) {
        
    	this.setTitulo(titulo);
        this.setAnioDePublicacion(anioDePublicacion);
        this.setMesDePublicacion(mesDePublicacion);
        this.setDiaDePublicacion(diaDePublicacion);
        this.setCodigo(codigo);
        this.setPrecio(precio);
        this.setTipoDeProducto(tipoDeProducto);
        this.setFechaDePublicacion(LocalDate.of(anioDePublicacion, mesDePublicacion, diaDePublicacion));
    }
    


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAnioDePublicacion() {
		return anioDePublicacion;
	}


	public void setAnioDePublicacion(int anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}


	public int getMesDePublicacion() {
		return mesDePublicacion;
	}


	public void setMesDePublicacion(int mesDePublicacion) {
		this.mesDePublicacion = mesDePublicacion;
	}


	public int getDiaDePublicacion() {
		return diaDePublicacion;
	}


	public void setDiaDePublicacion(int diaDePublicacion) {
		this.diaDePublicacion = diaDePublicacion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo2) {
		this.codigo = codigo2;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getTipoDeProducto() {
		return tipoDeProducto;
	}

	public void setTipoDeProducto(String tipoDeProducto) {
		this.tipoDeProducto = tipoDeProducto;
	}
	
	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public void mostrarDatosPublicacion() {
	    String tipoDeProducto = this.getTipoDeProducto();
	    String titulo = this.getTitulo();
	    String autor = this.getAutor();
	    String editorial = this.getEditorial();
	    String codigo = this.getCodigo();
	    double precio = this.getPrecio();
	    LocalDate fechaDePublicacion = this.getFechaDePublicacion();
	    
	    if (tipoDeProducto == null) {
	        tipoDeProducto = "no tiene";
	    }
	    if (titulo == null) {
	        titulo = "no tiene";
	    }
	    if (autor == null) {
	        autor = "no tiene";
	    }
	    if (editorial == null) {
	        editorial = "no tiene";
	    }
	    if (codigo == null) {
	        codigo = "sin codigo";//valor que le doy si no tiene codigo
	    }
	    
	    System.out.println("Tipo de producto: " + tipoDeProducto + "\nTitulo-Nombre: " + titulo + "\nAutor: " 
	    + autor + "\nEditorial: " + editorial + "\nFecha de publicacion: "+ fechaDePublicacion
	    +"\nCodigo del producto: "+ codigo +"\nPrecio de compra: " + precio + " Pesos");
	    System.out.println("--------------------------------");
	}
	
	   
}

