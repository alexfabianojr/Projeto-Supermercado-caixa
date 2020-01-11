package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	private double valorArrecadado; //utilizar o private por segurança (dados sensíveis)
	private List<Produto> produtosRegistrados;
	
	public BancoDeDados() {
		valorArrecadado = 0;
		produtosRegistrados = new ArrayList<Produto>();
	}
	
	public void incrementaValorArrecadado( double valorProduto ) {
		valorArrecadado += valorProduto;
	}
	
	public double getValorArrecadado() { //buscando dentro do encapsulamento
		return valorArrecadado;
	}
	
	public List<Produto> getProdutosRegistrados (){ //"array" sem limite de dados
		return produtosRegistrados;
	}
	public double buscaValorProdutoPeloCodigo(int codigo) {
		return produtosRegistrados.get(codigo).valor;
	}
	
	public void adicionarProduto(Produto produto) {
		int codigo = produtosRegistrados.size();
		produto.codigo = codigo;
		
		produtosRegistrados.add(produto);
	}
}
