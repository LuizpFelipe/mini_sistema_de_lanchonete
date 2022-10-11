package factory;

import java.util.ArrayList;
import java.util.List;

import entity.Batata;
import entity.Combo;
import entity.Pizza;
import entity.Produto;

public abstract class FactoryProduto{
	
	static List<Produto> prodt = new ArrayList<>();
	int contador = 1; 
	
	public static Pizza factoryPizza(String msg) throws Exception {
		Pizza pizza = null;
		
		if("calabresa".equals(msg.toLowerCase()))
			pizza = new Pizza("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.", 55.00);
		if("frango e catupiri".equals(msg.toLowerCase()))
			pizza = new Pizza("Frango e Catupiri: Frango, Catupiri, mussarela, Azeitona, Oregano", 70.00);
		
		if(pizza == null) {
			throw new Exception("Pizza Nulo");
		}
		
		return pizza;
	}
	
	public static Batata factoryBatata(String msg) throws Exception{
		Batata batata = null;
		if(msg.toLowerCase().equals("batata simples"))
			batata = new Batata("Batata Simples", 15.00);
		if(msg.toLowerCase().equals("batata especial"))
			batata = new Batata("Batata Especial: Cheddar, Bacon, Cebolinha", 20.00)	;	
		if(batata == null)
			throw new Exception("Batata Nulo");
		
		return batata;
	}
	
	public static Combo factoryCombo(int id) throws Exception {
		Combo combo = null;
		
		if(id == 1) {
			combo = new Combo(new Pizza("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.", null), new Batata("Batata Simples", null), 60.00);
		}
		
		if(id == 2) {
			combo = new Combo(new Pizza("Calabresa: Calabresa, mussarela, Presunto, Azeitona, Cebola.", null), new Batata("Batata Especial: Cheddar, Bacon, Cebolinha", null), 65.00);
		}
		
		if(id == 3) {
			combo = new Combo(new Pizza("Frango e Catupiri: Frango, Catupiri, mussarela, Azeitona, Orégano", null), new Batata("Batata Simples", null), 70.00);
		}
		
		if(id == 4) {
			combo = new Combo(new Pizza("Frango e Catupiri: Frango, Catupiri, mussarela, Azeitona, Orégano", null), new Batata("Batata Especial: Cheddar, Bacon, Cebolinha", null), 70.00);
		}
		
		if(combo == null) {
			throw new Exception("Combo Nulo");
		}
		return combo;
		
	}
	
	
}
