package ejercicios;
public class Ejercicio11Supuesto2chungo {
	static double comision, salario, aumento, subida;

	public static void main(String[] args) {
		salario = 14000;
		aumento = 0;
		comision = 0;
		
					
		//Scanner leer = new Scanner (System.in);
		//double salario = 0, comision = 0;
		
	/*	System.out.println("Introduzca su sueldo");
		salario = leer.nextDouble(); 
		System.out.println("Introduzca su comision");
		comision = leer.nextDouble(); 
	*/
		
	if (comision == 0) {
		verSalario();
	}else {
		verComision();
			
		//leer.close();
			  }
	
			System.out.print("El salario era : " + salario);
			System.out.print("\tLa subida es : " + subida + "%");
			System.out.print("\tEl aumento es : " + aumento);
			System.out.println("\tLe queda el salario : " + (salario + aumento));
		}
		
		private static void verSalario() {
		// el método puede ser o public o private 
			//double subida = 0;
			if (salario < 15000) {
			subida = 10;
			aumento = salario * subida/100;
		}else { if (salario >= 15000 && salario < 30000) {
				subida = 8;
				aumento = salario * subida/100;
			}else { if (salario >= 30000 && salario < 45000) {
					subida = 4;
					aumento = salario * subida/100;
						}else {
							subida = 0;
							aumento = 0;
						}
					}
			}
		 
	}
		
		private static void verComision () {
			if (comision < 2000) {
			//System.out.println("Aumento del 12%");
			subida = 12;
			aumento = salario * subida/100;
			
			} else { if (comision >=2000 && comision < 10000){
				//System.out.println("Aumento del 6%");
				subida = 6;
				aumento = salario * subida/100;	
			
			}else {
				subida = 0;
				aumento = 0;
				// System.out.println("Sin aumento");

				}
				}
			}
}
