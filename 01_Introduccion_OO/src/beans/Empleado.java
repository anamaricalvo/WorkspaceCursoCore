package beans;

public class Empleado {

		private int idEmpleado;
		private String nombre, apellidos, sexo;
		private double salario;
		private int edad;
		private Departamento departamento;
		
		// En un primero paso metimos esto a mano - public Empleado (int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad) {
		// este método se llama Constructor. Si lo creas vacío, es decir con () - paréntesis vacíos, se crea la estructura 
		
			
		public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad, Departamento departamento) {
			super();
			this.idEmpleado = idEmpleado;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = sexo;
			this.salario = salario;
			this.edad = edad;
			this.departamento = departamento;
			// estoy cogiendo la dirección de memoria del departamento que se creó primero
		}
		
		public Empleado () {
			super();
		}


		public int getIdEmpleado() {
			return idEmpleado;
		}

		public void setIdEmpleado(int idEmpleado) {
			this.idEmpleado = idEmpleado;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public Departamento getDepartamento() {
			return departamento;
		}

		public void setDepartamento(Departamento departamento) {
			this.departamento = departamento;
		}

		/* @Override
		public String toString() {
			return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + "]";
		
		Si queremos meter aquí Departamento metemos toString con Source
		*/
		@Override
		public String toString() {
			return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + "]";
			//	+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento + "]";
		}
	
		// METODOS RESPONSABILIDAD DE LA CLASE
		 public String nombreCompleto () {
			 return apellidos + ", " + nombre;
			 }
		 
		 public double salarioMensual() {
			 return salario/14;
		 	}
			 
		public double salarioMensual(int meses) {
			return salario/meses;
			}
		// Los dos últimos public double salarioMensual están sobrecargados. Tienen distinto número de variables
		
		public double aumentarSalario(int aumento) {
			return salario+= aumento;
		// esto significa salario + aumento				
		}
	}

