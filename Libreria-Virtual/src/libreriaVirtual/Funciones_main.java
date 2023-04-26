package libreriaVirtual;

import java.util.ArrayList;
import java.util.Scanner;

//en esta clase se encuentran todos los metodos que se usan para mostrar el menu interactivo

abstract class Funciones_main   {
	
	
	//metodo principal, el nombre podria haber sido mas intuitivo 
	public static void eleccion(ArrayList<Publicacion> listaDePublicaciones,ArrayList<ItemCarrito> itemsCarrito, Scanner sc, CarritoDeCompra carrito) {
		
		System.out.print
		("que desea hacer? introduzca un numero de la siguiente lista\n"
				+ "\n1-Agregar libro o revista a base de datos \n2-Ver libros y revistas disponibles \n3-Agregar libro o revista al carrito de compra\n"
				+ "4-Quitar libro o revista del carrito de compra \n5-Mostrar Carrito de compras\n6-Limpiar consola de windows\n7-Salir del programa\n\nintroduzca aqui su numero: ");
		
		
		int eleccion = sc.nextInt();
		System.out.println("--------------------------------");
		if(eleccion == 1) {
			ingresarNuevaPublicacion(listaDePublicaciones,itemsCarrito, sc, carrito);
			System.out.println("\npublicacion ingresada correctamente\n");
			System.out.println("--------------------------------");
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
		}
		else if(eleccion == 2) {
			if(listaDePublicaciones.isEmpty()) {
				System.out.println("\nla base de datos esta vacia\n");
				System.out.println("--------------------------------");
				eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
			}
			else {
			for (Publicacion p : listaDePublicaciones) p.mostrarDatosPublicacion();
			System.out.println("\nListado mostrado correctamente\n");
			System.out.println("--------------------------------");
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
			}
		}else if(eleccion == 3) {
			System.out.println("\nintroduzca el codigo de la publicacion que desea agregar al carrito\n");
			introducirPublicacionACarrito(listaDePublicaciones,itemsCarrito, sc, carrito);
			System.out.println("\npublicacion ingresada al carrito de compra correctamente\n");
			System.out.println("--------------------------------");
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
			
		}else if(eleccion == 4) {
			System.out.println("\nintroduzca el codigo de la publicacion que desea quitar del carrito\n");
			quitarPublicacionACarrito(listaDePublicaciones,itemsCarrito, sc, carrito);
			System.out.println("\npublicacion quitada del carrito de compra correctamente\n");
			System.out.println("--------------------------------");
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
			
		}else if(eleccion == 5) {
			
			carrito.mostrarItems();
			System.out.println();
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
		
		}else if(eleccion == 6) {
			try {
		        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		    } catch (Exception ex) {
		        ex.printStackTrace();
		    }
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
			
			
		}else if(eleccion == 7) {
			System.out.println();
			System.out.println("Gracias por usar esta aplicacion, hasta luego!");
			System.exit(0);
			

			
		}else {
			System.out.println("\nnumero incorrecto, por favor trate de nuevo\n");
			System.out.println("--------------------------------");
			eleccion(listaDePublicaciones,itemsCarrito,sc, carrito);
		}
	}
	
	
	
	
	public static void ingresarNuevaPublicacion(ArrayList<Publicacion> listaPublicaciones,ArrayList<ItemCarrito> itemsCarrito, Scanner scanner, CarritoDeCompra carrito) {
		
		System.out.print("\n1-Cargar Libro\n2-Cargar Revista\n\nintroduzca su numero: ");
		int eleccionPublicacion = scanner.nextInt();
		if(eleccionPublicacion == 1) {

			scanner.nextLine();
			String tipo = "Libro";
			
			System.out.println();
			System.out.print("titulo del libro: ");
			String titulo = scanner.nextLine();
			
			System.out.print("anio de publicacion: ");
			int anio = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("mes de publicacion: ");
			int mes = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("dia de publicacion: ");
			int dia = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("codigo: ");
			String codigo = scanner.nextLine();
			
			
			System.out.print("Presio de compra (Ingresa un numero con coma): ");
			double precio = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.print("Autor del libro: ");
			String autor = scanner.nextLine();
			
			System.out.print("editorial del libro: ");
			String editorial = scanner.nextLine();
			
			Libro libro = new Libro(titulo, anio, mes, dia, codigo, precio, autor, editorial, tipo);
			
			listaPublicaciones.add(libro);
		}else if(eleccionPublicacion == 2) {
			
			System.out.println();
			scanner.nextLine();
			String tipo = "Revista";

			System.out.print("titulo de la Revista: ");
			String titulo = scanner.nextLine();

			System.out.print("anio de publicacion: ");
			int anio = scanner.nextInt();
			scanner.nextLine();

			System.out.print("mes de publicacion: ");
			int mes = scanner.nextInt();
			scanner.nextLine();

			System.out.print("dia de publicacion: ");
			int dia = scanner.nextInt();
			scanner.nextLine();

			System.out.print("codigo: ");
			String codigo = scanner.nextLine();

			System.out.print("Presio de compra (Ingresa un numero con coma): ");
			double precio = scanner.nextDouble();
			scanner.nextLine();


			Revista revista = new Revista(titulo, anio, mes, dia, codigo, precio,tipo);

			listaPublicaciones.add(revista);
			
		}else {
			System.out.println();
			System.out.println("numero incorrecto, pruebe de nuevo. ");
			System.out.println();
			eleccion(listaPublicaciones,itemsCarrito,scanner, carrito);
		}
		
		
	}
    
		//para ingresar un libro o revista al carrito, tengo que poner un codigo (string) que se encuentre en la ArrayList de libros y revistas.
		public static void introducirPublicacionACarrito(ArrayList<Publicacion> listaPublicaciones,ArrayList<ItemCarrito> itemsCarrito, Scanner scanner, CarritoDeCompra carrito) {
			
			scanner.nextLine();
			System.out.print("Codigo: ");
			String codigoBuscado = scanner.nextLine();
			
			
			System.out.print("\n1-Copia fisica\n2-Copia digital\n\nintroduzca su numero: ");
			int fisicoODigital = scanner.nextInt();
			scanner.nextLine();
			boolean esFisico = true;
			if (fisicoODigital == 1) {
				esFisico = true;
			}
			else if (fisicoODigital == 2) {
				esFisico = false;
			}
			else {
				System.out.println("error, por favor trate de nuevo\n");
				System.out.println("--------------------------------");
				eleccion(listaPublicaciones,itemsCarrito,scanner, carrito);
			}
			
			System.out.println();
			System.out.print("cantidad deseada: ");
			int cantidad = scanner.nextInt();
			scanner.nextLine();
			
			boolean encontrado = false;
			for (Publicacion p : listaPublicaciones) {
				String objetoP = p.getCodigo();
			    if (objetoP.equals(codigoBuscado)) {
			        // Agregar el producto a la lista de compras
			    	ItemCarrito item = new ItemCarrito(p,cantidad,esFisico);
			    	carrito.agregarItem(item);
			    	encontrado = true;
			        break;
			    }
			    
			}
			if (!encontrado) {
				System.out.println("no se enceuntra el codigo, trate de nuevo");
				System.out.println("--------------------------------");
				eleccion(listaPublicaciones,itemsCarrito,scanner, carrito);
			}
	    	
	}
	
	//funciona igual que el metodo de agregar al carrito, pero quitando ese item
	public static void quitarPublicacionACarrito(ArrayList<Publicacion>listaPublicaciones ,ArrayList<ItemCarrito> itemsCarrito, Scanner scanner, CarritoDeCompra carrito) {
			
			scanner.nextLine();
			System.out.print("Codigo: ");
			String codigoBuscado = scanner.nextLine();
		
			
			boolean encontrado = false;
			for (ItemCarrito i : itemsCarrito) {
				
				String objetoi = i.getPublicacion().getCodigo();
			    if (objetoi.equals(codigoBuscado)) {
			        // Agregar el producto a la lista de compras
			    	carrito.quitarItem(i);
			    	encontrado = true;
			        break;
			    }
			    
			}
			if (!encontrado) {
				System.out.println("no se enceuntra el item");
				eleccion(listaPublicaciones,itemsCarrito,scanner, carrito);
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
