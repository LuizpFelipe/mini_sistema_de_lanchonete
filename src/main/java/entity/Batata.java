package entity;

public class Batata extends Produto {

	public Batata(String tipo, Double preco) {
		super(tipo, preco);
	}

	@Override
	public String toString() {
		return " - " + "Produto: " + super.getTipo() + " Preço: R$ " + super.getPreco();
	}
}
