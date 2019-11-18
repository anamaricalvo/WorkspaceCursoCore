package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestRRHHParte1 {

	public static void main(String[] args) {
		//loDeArriba();
		Departamento dep1 = null;
		dep1 = findbyId(30);
		System.out.println(dep1);
	}

	public static Departamento findbyId(int id) {
		if (id != 30)
			return null;
				Departamento dep30 = new Departamento(30, "Ventas");
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 35_000, 45, dep30);
	/*	emp115 = new Empleado(115, "sara", "perez", "M", 20_000, 35, dep30);
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 18_000, 20, dep30);
		emp300 = new Empleado(300, "natalia", "vazquez", "M", 60_000, 27, dep30);
	*/	
		dep30.setJefe(emp114);
		
		return dep30;
	}
		
	/*  Departamento dep30 = new Departamento(30, "Ventas");
		//30 es el idDepartamento. Estamos creando un dpto con 3 variables. Al dejar la última a null los estoy dejando sin apuntar a nada (=sin jefe)
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 35_000, 45, dep30);
		emp115 = new Empleado(115, "sara", "perez", "M", 20_000, 35, dep30);
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 18_000, 20, dep30);
		emp300 = new Empleado(300, "natalia", "vazquez", "M", 60_000, 27, dep30);
		
		//hacemos a diego el jefe
		dep30.setJefe(emp114);
		
		//CASO A
		Departamento dep120 = new Departamento (120, "Formacion", new Empleado(225, "carmen", "gonzalez", "M", 70_000, 43, dep30));
		//donde hay una referencia a una variable de tipo clase puedo hacer directamente un new
		//con new Empleado(225, "carmen", "gonzalez", "M", 70_000, 20, dep30)) estoy metiendo un objeto
		
		//Asignación de jefe que pertenece a otro departamento
		dep120.getJefe().setDepartamento(dep120);
		//para modificar algo que tengo dentro, accedo a ello (acceder a algo es un get) y a sus métodos y lo cambiamos. Recordar que estamos en memoria
				
		//CASO B
		Departamento dep130 = new Departamento (130, "Logistica", emp300);
		//Estamos haciendo lo mismo que en el CASO A, pero con emp300 estoy metiendo la variable directamente (que ya la creamos al hacer new Empleado). 
		//En comparación con el CASO A, que creamos el objeto-creamos la variable directamente- porque no hemos creado la variable previamente arriba/*

		emp300.setDepartamento(dep130);
		
		System.out.println("Departamento 120: " + dep120.getJefe().getDepartamento().getNombre());
		//get es sacar algo. El get me da ("me saca" lo que hay en la dirección de memoria
		System.out.println("Departamento 130: " + dep130.getJefe().getDepartamento().getNombre());
		System.out.println(emp300);
		// si no quitamos "departamento=" + departamento + "" en el archivo "Departamento.java" se bucla	
	}
	
			public static void loDeArriba() {
			
			Departamento dep30 = new Departamento(30, "Ventas");
			Empleado emp114, emp115, emp116, emp300;
			
			emp114 = new Empleado(114, "diego", "martinez", "H", 35_000, 45, dep30);
			emp115 = new Empleado(115, "sara", "perez", "M", 20_000, 35, dep30);
			emp116 = new Empleado(116, "carlos", "sanchez", "H", 18_000, 20, dep30);
			emp300 = new Empleado(300, "natalia", "vazquez", "M", 60_000, 27, dep30);
			
			dep30.setJefe(emp114);
			
			Departamento dep120 = new Departamento (120, "Formacion", new Empleado(225, "carmen", "gonzalez", "M", 70_000, 43, dep30));
			
			dep120.getJefe().setDepartamento(dep120);
		
			Departamento dep130 = new Departamento (130, "Logistica", emp300);
			
			emp300.setDepartamento(dep130);
			
			System.out.println("Departamento 120: " + dep120.getJefe().getDepartamento().getNombre());
			System.out.println("Departamento 130: " + dep130.getJefe().getDepartamento().getNombre());
			*/
		}

