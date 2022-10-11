package teste;

import java.util.ArrayList;
import java.util.List;

import entity.Pedido;
import entity.Produto;
import service.PedidoService;

public class aplicacao {
	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();
		
		try {
			PedidoService pedido = new PedidoService("Luiz", list);
			
			pedido.addProduto(Produto.factoryPizza("calabres"));
			pedido.addProduto(Produto.factoryPizza("calabresa"));
			pedido.addProduto(Produto.factoryCombo(1));
			pedido.Total();
			pedido.removeProduto("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.");
			
			pedido.Total();
			
			System.out.println(pedido.getProdutos().size());
			pedido.removeProduto("");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
