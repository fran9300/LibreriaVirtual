/*LIBRERÍA VIRTUAL

Una librería lo ha contratado para que le construya una aplicación que:
- Calcule los precios de venta de sus libros y revistas. El precio de venta se calcula a partir del precio
de compra. Un libro tiene un título, un autor principal, una fecha de publicación, una editorial y un
código. Una revista tiene un nombre, una fecha de publicación, un editor y un código. Cada
producto (libro o revista) puede venderse como una copia física o digital.
Para calcular el precio de venta al público se tienen en cuenta las siguientes consideraciones:
• El precio de venta de una copia física de un libro es del 18% más del precio de compra.
• El precio de venta de un libro digital es del 8% más del precio de compra.
• El precio de venta de una copia física de una revista es del 22% más del precio de compra.
• El precio de venta de una revista digital es del 12% más del precio de compra.
- El programa debe implementar un carrito de comprar que permita agregar productos, eliminarlos,
mostrar los en pantalla y calcular el total a abonar.


Debe proyecto debe implementar:
• Herencia
• Clases Abstractas
• Constructores explícitos
• Encapsulamiento
• Métodos Setter y Getter


Entrega:
• Implemente la solución Back-End en Java usando Git.
• Este trabajo se puede hacer en grupo de máximo 5 estudiantes.
• El trabajo debe ser entregado a través de la plataforma GitHub.
*/


package libreriaVirtual;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Funciones_main{

	public static void main(String[] args) throws IOException  {
		
		//esto se usa para crear el jar ejecutable
		/*
		if (System.console() == null) {
		    Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd.exe","/k","java -jar LibreriaVirtual.jar"});
		} else {
		    
		}
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		//creo mi carrito de compra
		CarritoDeCompra carrito1 = new CarritoDeCompra();
		
		//lista de libros y revistas
		ArrayList<Publicacion> listaDePublicaciones = new ArrayList<Publicacion>();
		
		
		//creo mis libros y revistas
		
		Libro l1 = new Libro("1984", 1949, 6,8,"01001",100,"George Orwell","Secker and Warburg", "Libro");
		Libro l2 = new Libro("Cien anios de soledad",1967,5,30,"01002",120,"Gabriel Garcia Marquez","Sudamericana", "libro");

		Revista r1 = new Revista("Time", 1923, 3, 3, "02001", 50, "Revista");
		Revista r2 = new Revista("National Geographic", 1888, 10, 1, "02002", 25, "Revista");
		
	
		//agrego mis libros y revistas a la lista
		listaDePublicaciones.add(l1);
		listaDePublicaciones.add(l2);
		
		listaDePublicaciones.add(r1);
		listaDePublicaciones.add(r2);
		
		
		//correr el codigo
		System.out.println();
		System.out.println("ya hay un par de publicaciones cargadas, por si desea probarlas\n");
		eleccion(listaDePublicaciones,carrito1.items, sc, carrito1);
		carrito1.mostrarItems();
		
		
		
		
	}
	
	


}






