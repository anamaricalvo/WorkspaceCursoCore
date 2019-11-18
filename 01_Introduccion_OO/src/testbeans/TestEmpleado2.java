package testbeans;
import beans.Empleado;

public class TestEmpleado2 {

	public static void main(String[] args) {
		Empleado emp3= new Empleado(115, "andrea", "sanchez pastor", "M", 78000, 24, null);

		System.out.println("Mi salario anterior era : " + emp3.getSalario());
		System.out.println(emp3.aumentarSalario(1000));
		System.out.println("Mi salario actual es: " + emp3.nombreCompleto() + " " + emp3.getSalario());
	}

}
