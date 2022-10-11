package entity;

import factory.FactoryProduto;

public abstract class Produto extends FactoryProduto{
	private String tipo;
	private Double preco;
	
	public Produto() {
		
	}
	
	public Produto(String tipo, Double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
