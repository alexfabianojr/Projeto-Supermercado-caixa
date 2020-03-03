package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private double amountCollected; 
	private List<Product> registeredProduct;
	
	public DataBase() {
		amountCollected = 0;
		registeredProduct = new ArrayList<Product> ();
	}
	
	public void incrementAmountCollected ( double productPrice ) {
		amountCollected += productPrice;
	}
	
	public double getValorArrecadado() { 
		return amountCollected;
	}
	
	public List<Product> getProdutosRegistrados (){ 
		return registeredProduct;
	}
	public double buscaValorProdutoPeloCodigo (int codigo) {
		return registeredProduct.get(codigo).productValue;
	}
	
	public void adicionarProduto (Product produto) {
		int codigo = registeredProduct.size();
		produto.productCode = codigo;
		
		registeredProduct.add(produto);
	}
}
