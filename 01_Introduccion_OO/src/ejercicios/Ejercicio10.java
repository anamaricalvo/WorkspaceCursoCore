package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		10.	Pedimos por pantalla un nombre y una contrase�a:
			a.	si el nombre coincide con �sara�, preguntamos por  la contrase�a y si coincide con �sarita�, escribimos el mensaje �usuario y contrase�a correctas, bienvenido a la aplicaci�n�
			b.	Si el nombre NO es �sara� Escribimos usuario incorrecto�
			c.	Si el nombre es correcto y la contrase�a NO, Escribimos �contrase�a incorrecta�
		*/
				
		Scanner leer = new Scanner (System.in);
		String usuario = null;
		String password = null;
		
		System.out.println("Meta su nombre");
		usuario = leer.next(); 
		
		if (usuario.equals("sara")) {
			System.out.println("Meta su contrase�a");
			password = leer.next(); 
			
			if (password.equals("sarita"))	
				System.out.println("usuario y contrase�a correctas, bienvenido a la aplicaci�n");
			else
				System.out.println("contrase�a incorrecto");
		}
		else
			System.out.println("usuario incorrecto");
			
		leer.close();
	
	}

}
