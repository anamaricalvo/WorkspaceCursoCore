package testbeans;

import beans.Cliente;

public class TestDameClientes {
	public static void main(String[] args) {
	
				Cliente otroCliente = Cliente.dameCliente();
				Cliente [] mis = Cliente.dameClientes();
				
				for (Cliente ele: mis)
					System.out.println(ele.getNombre());
						
				for (int i=0; i<mis.length; i++)
					System.out.println(mis[i]);
	}
}
