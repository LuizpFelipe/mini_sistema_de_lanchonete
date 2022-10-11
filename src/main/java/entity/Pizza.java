package entity;

public class Pizza extends Produto {

	public Pizza(String tipo,Double preco) {
		super(tipo, preco);
	}

	@Override
	public String toString() {
		return "Produto: " + super.getTipo() + " Preço: R$ " +  super.getPreco();
	}
	
	
	
	
}
