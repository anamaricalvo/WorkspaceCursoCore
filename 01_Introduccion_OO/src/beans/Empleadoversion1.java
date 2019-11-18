package beans;

public class Empleadoversion1 {

	int idEmpleado;
	String nombre, apellidos, sexo;
	double salario;
	int edad;
	
	// REESCRIBIR UN METODO DE MI PADRE (que tiene la clase Object porque es el método toString)
	// Primero el ámbito (public), luego el tipo de lo que devuelve (String), luego el nombre del método (toString) y luego entre paréntesis, lo que recibe
	
	@Override
	 public String toString() {
		/* cuando un método devuelve algo, la palabra para devolver es "return". Cuando pones retour en un método, aunque tengas instrucciones por debajo, no se 
		 ejecuta. En cuanto metes un retour, te pega el bote. Si, pej, tuvieras un if por debajo, no lo ejecuta.
		 */
		return "nombre : " + nombre + "Salario: " + salario ;
		// Al tener yo toString, se está ejecutando el mío
		
	}
	

	}


