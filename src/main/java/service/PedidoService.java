package service;

import java.util.List;

import entity.Pedido;
import entity.Produto;

public class PedidoService extends Pedido {
	private String nome;
	private List<Produto> produtos;
	
	public PedidoService(String nome, List<Produto> list) {
		this.nome = nome;
		this.produtos = list;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto prod) {
		produtos.add(prod);
	}

	public void imprimiListProdutos() {
		System.out.println(nome);
		produtos.forEach(System.out::println);
	}

	public Double Total() {
		double soma = 0;
		for (Produto preco : produtos) {
			soma += preco.getPreco();
		}
		System.out.println(soma);
		return soma;
	}

	public void removeProduto(String nome) throws Exception {
		for (Produto produto : produtos) {
			if(produto.getTipo().equals(nome)){
				produtos.remove(produto);
				break;
			}
			
		throw new Exception("Produto não Encontrado");
		}
	}
}
