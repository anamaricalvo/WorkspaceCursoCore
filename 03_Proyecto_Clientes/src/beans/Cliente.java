package beans;

public class Cliente {
	private String usuario, pwd, nombre, apellido, direccion;
 

	public Cliente(String usuario, String pwd, String nombre, String apellido, String direccion) {
		super();
		this.usuario = usuario;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public Cliente() {
		super();
	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pwd=" + pwd + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + "]";
	}

	public static Cliente dameCliente() {
		return new Cliente ("tomas", "tomas", "tomasin", "escu",  "calle paz, 3, madrid");
		
	}

	public static Cliente [] dameClientes() {
		
	 
		Cliente [] clientes = {
								new Cliente ("tomas", "tomas", "tomasin", "escu", "calle paz, 3, madrid"),
								new Cliente ("sara", "sara", "sarita", "perez", "calle nuez, 32, sevilla"),
								new Cliente ("eva", "ruiz", "evita", "goma", "calle lirio, 3, cadiz"),
								new Cliente ("ana", "ana", "anita", "lista", "calle rosa, 333, cuenca")
							};
		return clientes;	

		}
	}


