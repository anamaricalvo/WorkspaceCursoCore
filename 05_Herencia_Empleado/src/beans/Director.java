package beans;

public class Director extends Empleado {

	private int acciones;
	private String tablet;
	
	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, double comision,
			int edad, Departamento departamento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellidos, sexo, salario, comision, edad, departamento);
		this.acciones = acciones;
		this.tablet = tablet;
	}

	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, double comision,
			int edad, Departamento departamento) {
		super(idEmpleado, nombre, apellidos, sexo, salario, comision, edad, departamento);
	}

	public int getAcciones() {
		return acciones;
	}

	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}

	public String getTablet() {
		return tablet;
	}

	public void setTablet(String tablet) {
		this.tablet = tablet;
	}

	@Override
	public double salarioMensual() {
		return totalSalario()/MESES_NOMINA;
	}

	@Override
	public double salarioMensual(int meses) {
		return totalSalario()/meses;
	}

	@Override
	public double totalSalario() {
		return salario + comision + (acciones * VALOR_ACCION);
	}

	
	
	
	
}
