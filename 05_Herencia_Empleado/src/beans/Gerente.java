package beans;

public class Gerente extends Empleado {
		
		private int Garaje;
		private String movil;
		private double variable;
		
				
		public Gerente(int idEmpleado, String nombre, String apellidos, String sexo, double salario, double comision, int edad, Departamento departamento, int garaje, String movil, double variable) {
			super(idEmpleado, nombre, apellidos, sexo, salario, comision, garaje, departamento);
			Garaje = garaje;
			this.movil = movil;
			this.variable = variable;
		}

		public Gerente(int idEmpleado, String nombre, String apellidos, String sexo, double salario, double comision,
				int edad, Departamento departamento) {
			super(idEmpleado, nombre, apellidos, sexo, salario, comision, edad, departamento);
		}

		public int getGaraje() {
			return Garaje;
		}


		public void setGaraje(int garaje) {
			Garaje = garaje;
		}


		public String getMovil() {
			return movil;
		}


		public void setMovil(String movil) {
			this.movil = movil;
		}


		public double getVariable() {
			return variable;
		}


		public void setVariable(double variable) {
			this.variable = variable;
		}


		@Override
		public String toString() {
			if (departamento == null)
			return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
					+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento + ", Garaje="
					+ Garaje + ", movil=" + movil + ", variable=" + variable + "]";
			else
				return "Gerente [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", departamento=" + departamento + ", Garaje="
				+ Garaje + ", movil=" + movil + ", variable=" + variable + "]";
		
		}

		@Override
		public void setSalario(double salario) {
				super.setSalario(salario);
		}

		@Override
		public double salarioMensual() {
				return super.salarioMensual();
		}

		@Override
		public double salarioMensual(int meses) {
				return super.salarioMensual(meses);
		}
		
		
	
}
