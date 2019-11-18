package testbeans;

import beans.Cliente;
import beans.Pedido;

public class TestPedido {

	public static void main(String[] args) {
		Pedido ped1 = new Pedido (1, "tornillo 4-30", 1, true, Cliente.dameCliente());
		
		System.out.print("Pedido:" + ped1.getIdPedido());
		System.out.print("\tDescripcion : " + ped1.getDescripcion());
		System.out.println("\tCliente : "+ ped1.getCliente().getNombre().toUpperCase());
		
		//Pedido ped2 = new Pedido (2, "ingletadora", 150, true, Cliente.dameCliente());
	}
}
