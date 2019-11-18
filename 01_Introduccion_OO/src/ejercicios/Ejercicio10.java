package ejercicios;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		10.	Pedimos por pantalla un nombre y una contraseña:
			a.	si el nombre coincide con “sara”, preguntamos por  la contraseña y si coincide con “sarita”, escribimos el mensaje “usuario y contraseña correctas, bienvenido a la aplicación”
			b.	Si el nombre NO es “sara” Escribimos usuario incorrecto”
			c.	Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”
		*/
				
		Scanner leer = new Scanner (System.in);
		String usuario = null;
		String password = null;
		
		System.out.println("Meta su nombre");
		usuario = leer.next(); 
		
		if (usuario.equals("sara")) {
			System.out.println("Meta su contraseña");
			password = leer.next(); 
			
			if (password.equals("sarita"))	
				System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
			else
				System.out.println("contraseña incorrecto");
		}
		else
			System.out.println("usuario incorrecto");
			
		leer.close();
	
	}

}
