package testbeans;
import beans.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		Empleado emp1, emp2, emp3;
		//String nombre = "cucu";
		
		emp1 = new Empleado();
		emp2 = new Empleado(114, "eva", "perez", "M", 45000, 43, null);
		emp3 = new Empleado(115, "andrea", "sanchez pastor", "M", 78000, 24, null);
				
		emp1.setIdEmpleado(114);
		emp1.setNombre("rafael");
		emp1.setApellidos("delgado");
		emp1.setEdad(56);
		emp1.setSalario(34500);
		emp1.setSexo("H");
			
		/*	
		emp1.idEmpleado = 100;
		emp1.nombre = "tomas";
		emp1.apellidos = "escu delgado";
		emp1.edad = 58;
		emp1.salario = 25000;
		emp1.sexo = "h";
		
		emp2.idEmpleado = 100;
		emp2.nombre = "tomas";
		emp2.apellidos = "escu delgado";
		emp2.edad = 58;
		emp2.salario = 25000;
		emp2.sexo = "h";
		
		emp3.idEmpleado = 100;
		emp3.nombre = "pedro";
		emp3.apellidos = "escu delgado";
		emp3.edad = 58;
		emp3.salario = 31000;
		emp3.sexo = "h";
		
		System.out.println(emp1.nombre);
				*/
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(emp1.getSalario());
		System.out.println(emp2.getNombre());
		
		}
}
