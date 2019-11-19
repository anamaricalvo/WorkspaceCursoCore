package main;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Pelicula;
import bean.Director;

public class MainPelicula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

		int opcion = 0;
		System.out.println("Bienvenidos a nuestro videoclub");

		do {
			System.out.println("1 - Alta Pelicula");
			System.out.println("2 - Listar pelicula");
			System.out.println("3 - Buscar Pelicula por titulo");
			System.out.println("0 - Salir del programa");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("Inroduzca el título");
				String titulo = sc.next();
				System.out.println("Inroduzca el género");
				String genero = sc.next();
				System.out.println("Introduzca el Nombre del Director");
				String nombre = sc.next();
				System.out.println("Introduzca la Edad del Director");
				int edad = sc.nextInt();
				System.out.println("Introduzca el Año de Estreno");
				int anioEstreno = sc.nextInt();

				Pelicula pelicula = new Pelicula();
				pelicula.setTitulo(titulo);
				pelicula.setGenero(genero);
				Director director = new Director();
				director.setNombre(nombre);
				director.setEdad(edad);
				pelicula.setDirector(director);
				pelicula.setAnioEstreno(anioEstreno);

				listaPeliculas.add(pelicula);

			}else if (opcion == 2) {
				for (Pelicula pelicula : listaPeliculas) {
					System.out.println(pelicula);
				}
				
			}else if (opcion == 3) {
				System.out.println("Introduzca el título a buscar");
				String titulo = sc.next();
				for (Pelicula pelicula : listaPeliculas) {
					String tituloDePel = pelicula.getTitulo();
					if (tituloDePel.contains(titulo))
						System.out.println(pelicula);
				}
			}

		} while (opcion != 0);

		System.out.println("Adios!! :) :) :)");
		
		sc.close();
	}
}
