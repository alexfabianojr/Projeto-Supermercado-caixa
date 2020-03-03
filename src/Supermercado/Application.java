package Supermercado;
import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner (System.in);
	private DataBase object_DataBase = new DataBase();

	public void startApplication() {
		boolean loopState = true;
		int switchChoose;
		
		while (loopState) {
			
			System.out.println("1 - Registrar Novo Produto");
			System.out.println("2 - Realizar Venda");
			System.out.println("3 - Total Arrecadado");
			System.out.println("0 - Encerrar");
			
			switchChoose = sc.nextInt();
			
			switch (switchChoose) {
				
				case 0:
					sc.close();
					System.exit(0);
					break;
				
				case 1:
					Product object_Product = new Product();
					
					System.out.println("Digite o nome do produto");
					String newProductName = sc.nextLine();
					sc.nextLine();
					
					System.out.println("Digite o valor do produto");
					double newProductValue = sc.nextDouble();
					
					object_Product.productName = newProductName;
					object_Product.productValue = newProductValue;
					
					object_DataBase.adicionarProduto(object_Product);
					
					break;
				
				case 2:
					
					System.out.println("Digite o código do produto: ");
					
					int codigo = sc.nextInt();
					
					double armazenaValorProduto = object_DataBase.buscaValorProdutoPeloCodigo(codigo);			
					object_DataBase.incrementAmountCollected(armazenaValorProduto);
					break;
				
				case 3:
					System.out.println("O valor total do caixa é: " + object_DataBase.getValorArrecadado());
					break;
			}
		}
	}
}
