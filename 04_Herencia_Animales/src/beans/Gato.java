package beans;

public class Gato extends Animal {

	private int vidas;
	
	public Gato(String color, int vidas) {
		super(color);
		this.vidas = vidas;
	}
	
	public Gato() {
		super();
		//color = "Marillo - Amarron";
		//this.setColor("Marillo - Amarron");
				}

	public int getVidas() {
		return vidas;
				}

	public void setVidas(int vidas) {
		this.vidas = vidas;
		}
	
	public void mostrarDatos() {
		
		System.out.println("vidas : " + vidas);
		System.out.println("color : " + color);
		}
	
	public void trepar () {
		System.out.println("trepo que lo flipas");
	}
	
	//Métodos reescritos de mi padre (Animal)
	
	@Override
	public void saludar() {
		System.out.println("soy un Gato y tengo : "+ vidas + " vidas");
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", vidas=" + vidas + "]";
	}

	@Override
	public void sonido() {
		System.out.println("soy : "+ color + " y digo MIAUUUUU");
	}
	
	
	
	}


