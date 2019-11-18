package bean;

import java.util.ArrayList;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona pAux = p1;
			// Persona pAux es otro mando a distancia
		p1.setNombre("Bud Spencer");
		p1.setEdad(89);
		p1.setPeso(120);
		
		Persona p2 = new Persona ("Terence Hill", 67, 70);
		
		pAux.setEdad(33);
		System.out.println(p1.getEdad());
		cambiarEdad(p1);
		System.out.println(pAux.getEdad());
	
		p2 = pAux;
		
		int numero = 50;
		cambiarEntero(numero);
		System.out.println(numero);
		
		System.out.println(pAux);
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		Persona p3 = new Persona();
		p3.setNombre("Harry Potter");
		p3.setEdad(19);
		p3.setPeso(56);
		
		listaPersonas.add(p3);
		// añade en la primera posicion que tiene libre el array a Harry Potter
		System.out.println(listaPersonas);
		
		//System.out.println(listaPersonas.get(0));
		p3.setEdad(20);
		//listaPersonas.get(0).setEdad(20); es lo mismo que lo de la línea 42 pero siguiendo "otro camino" para buscar la info de la referencia
		
		listaPersonas.add(pAux);
		pAux=null;
		
		System.out.println(listaPersonas);
		
		int cp = 01234;//base octal
		cp = 0xFFF;//base hexadecimal
		cp = 0b101;//binario
		System.out.println(cp);
		
		Persona p4 = new Persona();
		p4.setNombre("Mortadelo");
		p4.setEdad(80);
		p4.setPeso(70);
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Gran Vía");
		d1.setCiudad("Madrid");
		d1.setCp("28054");
		
		p4.setDireccion(d1);
		
		listaPersonas.add(p4);
			}
				
		public static void cambiarEdad (Persona p) {
			p.setEdad(45);
		}
		
		public static void cambiarEntero (int numero) {
			numero = 100;
	}
}

