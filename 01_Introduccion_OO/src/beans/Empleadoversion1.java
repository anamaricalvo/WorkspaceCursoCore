package beans;

public class Empleadoversion1 {

	int idEmpleado;
	String nombre, apellidos, sexo;
	double salario;
	int edad;
	
	// REESCRIBIR UN METODO DE MI PADRE (que tiene la clase Object porque es el m�todo toString)
	// Primero el �mbito (public), luego el tipo de lo que devuelve (String), luego el nombre del m�todo (toString) y luego entre par�ntesis, lo que recibe
	
	@Override
	 public String toString() {
		/* cuando un m�todo devuelve algo, la palabra para devolver es "return". Cuando pones retour en un m�todo, aunque tengas instrucciones por debajo, no se 
		 ejecuta. En cuanto metes un retour, te pega el bote. Si, pej, tuvieras un if por debajo, no lo ejecuta.
		 */
		return "nombre : " + nombre + "Salario: " + salario ;
		// Al tener yo toString, se est� ejecutando el m�o
		
	}
	

	}


