package entity;

import java.util.List;

public abstract class Pedido{
	private String nome;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public void addProduto(Produto prod) {
		produtos.add(prod);
	}

	public void imprimiListProdutos() {
		System.out.println(nome);
		produtos.forEach(System.out::println);
	}

	public double Total() {
		double soma = 0;
		for (Produto preco : produtos) {
			soma += preco.getPreco();
			
		}
		System.out.println(soma);
		return soma;
		
		
	}

	public void removeProduto(String nome) {
		produtos.removeIf(produto-> produto.getTipo().equals(nome));
	}*/

}
