package main;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Coche;


public class MainCoche {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		int opcion = 0;
		System.out.println("Bienvenidos a nuestro programa");
		
		do {
			System.out.println("1 - Alta de coche");
			System.out.println("2 - Listar coches");
			System.out.println("0 - Salir del programa");
			opcion = sc.nextInt();//recogemos la opcion del usuario
			if(opcion == 1) {
				//dar de alta coche
				System.out.println("Inroduzca la matricula");
				String matricula = sc.next();
				System.out.println("Inroduzca la marca");
				String marca = sc.next();
				System.out.println("Inroduzca el modelo");
				String modelo = sc.next();
				
				Coche coche = new Coche();
				coche.setMatricula(matricula);
				coche.setModelo(modelo);
				coche.setMarca(marca);
				
				listaCoches.add(coche);
			}else if(opcion == 2) {
				//listar los coches
				for(Coche coche : listaCoches) {
					System.out.println(coche);
				}
			}
			
		} while (opcion != 0);
		
		System.out.println("Adios!! :) :) :)");


	
	}

}

