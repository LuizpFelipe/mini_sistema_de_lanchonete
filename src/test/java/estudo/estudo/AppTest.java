package estudo.estudo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import entity.Produto;
import service.PedidoService;

public class AppTest {

	public ErrorCollector error = new ErrorCollector();
	List<Produto> list = new ArrayList<>();
	PedidoService pedido = new PedidoService("Luiz", list);

	// Testa se a factoryPizza retorna um Objeto do Tipo Pizza
	@Test
	public void testando_factoryPizza() {
		try {
			Assert.assertSame("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.",
					Produto.factoryPizza("calabresa").getTipo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Testa se a factoryBatata retorna um Objeto do Tipo batata
	@Test
	public void testando_factoryBatata() {
		try {
			assertEquals("Batata Simples", Produto.factoryBatata("batata simples").getTipo());
			assertEquals("Batata Especial: Cheddar, Bacon, Cebolinha",
					Produto.factoryBatata("batata especial").getTipo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Este teste esperar a Exception que vai ser gerada se qualquer Produto for
	// nulo
	@Test(expected = Exception.class)
	public void retornando_exception_de_valor_nulo_de_Factory() throws Exception {
		Produto.factoryPizza("");
		Produto.factoryBatata(null);
		Produto.factoryCombo(0);
		
	}

	// Verifica se o metodo Total retorna o valor somado de todos os produtos dentro
	// do Pedido
	@Test
	public void teste_de_Total() throws Exception {
		pedido.addProduto(Produto.factoryPizza("calabresa".toLowerCase()));
		pedido.addProduto(Produto.factoryBatata("Batata simples".toLowerCase()));
		pedido.addProduto(Produto.factoryCombo(1));

		error.checkThat(pedido.Total(), CoreMatchers.is(55.0));
	}

	// O teste serve para ver se o metodo removeProduto tira somente o primeiro
	// produto do valor que lhe for passado como Parametro//
	@Test
	public void teste_do_metodo_removeProduto() throws Exception {
		pedido.addProduto(Produto.factoryPizza("calabresa".toLowerCase()));
		pedido.addProduto(Produto.factoryBatata("Batata simples".toLowerCase()));
		pedido.addProduto(Produto.factoryCombo(1));

		pedido.removeProduto("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.");

		Assert.assertEquals(pedido.getProdutos().get(0).getTipo(), "Batata Simples");

	}

	@Test(expected = Exception.class)
	public void teste_de_exception_removeProduto() throws Exception {
		pedido.removeProduto("");
	}
}
