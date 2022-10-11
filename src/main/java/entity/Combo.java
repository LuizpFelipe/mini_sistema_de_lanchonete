package entity;

public class Combo extends Produto {
	private Batata batata;
	private Pizza pizza;
	private Double preco;

	public Combo(Pizza pizza, Batata batata, double preco) {
		this.pizza = pizza;
		this.batata = batata;
		this.preco = preco;
	}

	public Batata getBatata() {
		return batata;
	}

	public void setBatata(Batata batata) {
		this.batata = batata;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Combo: " + batata.getTipo() + ", pizza: " + pizza.getTipo() + ", Preço: R$ " + preco;
	}


}
