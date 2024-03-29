package main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Habitacion;
import bean.Casa;
import bean.Propietario;

public class MostrarCasa {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Margarita");
		d1.setCiudad("Madrid");
		d1.setCp("28043");
		
		Direccion d2 = new Direccion();
		d2.setTipoVia("Avenida");
		d2.setNombreVia("Jazmines");
		d2.setCiudad("Madrid");
		d2.setCp("28042");
		
	
		Habitacion h1 = new Habitacion();
		h1.setM2(90.6);
		h1.setTipo("Salon");
		
		Habitacion h2 = new Habitacion();
		h2.setM2(20.0);
		h2.setTipo("Dormitorio");
		
		Habitacion h3 = new Habitacion();
		h3.setM2(30.5);
		h3.setTipo("Cocina");
		
		Habitacion h4 = new Habitacion();
		h4.setM2(15);
		h4.setTipo("Ba�o");
		
		Propietario p1 = new Propietario();
		p1.setDireccion (d2);
		p1.setNombre("Tony Crespo");
		p1.setEdad(53);
		p1.setPeso(90);
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		listaHabitaciones.add(h4);
		
		Casa c1 = new Casa();
		c1.setDireccion(d1);
		c1.setListaHabitacion(listaHabitaciones);
		c1.setPrecio(1000);
		c1.setPropietario(p1);
		
		//System.out.println(listaHabitaciones);
		System.out.println(c1);
		
		
	}

}
