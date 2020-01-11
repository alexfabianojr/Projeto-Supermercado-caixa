package Supermercado;
import java.util.Scanner;

public class Caixa {
	Scanner sc = new Scanner (System.in);
	private BancoDeDados bancoDeDados = new BancoDeDados();

	public void iniciarCaixa() {
		boolean estadoLoop = true;
		int interruptor;
		
		while (estadoLoop) {
			
			System.out.println("1 - Registrar novo produto");
			System.out.println("2 - Realizar uma venda");
			System.out.println("3 - Total arrecadado");
			interruptor = sc.nextInt();
			
			switch (interruptor) {
				
				case 0:
					estadoLoop = false;
					break;
				
				case 1:
					Produto novoProduto = new Produto();
					
					System.out.println("Digite o nome do produto");
					String nome = sc.nextLine();
					sc.nextLine();
					
					System.out.println("Digite o valor do produto");
					double valor = sc.nextDouble();
					
					novoProduto.nome = nome;
					novoProduto.valor = valor;
					
					bancoDeDados.adicionarProduto(novoProduto);
					
					break;
				
				case 2:
					
					System.out.println("Digite o código do produto: ");
					
					int codigo = sc.nextInt();
					
					double armazenaValorProduto = bancoDeDados.buscaValorProdutoPeloCodigo(codigo);			
					bancoDeDados.incrementaValorArrecadado(armazenaValorProduto);
					break;
				
				case 3:
					System.out.println("O valor total do caixa é: " + bancoDeDados.getValorArrecadado());
					break;
			}
		}
	}
}
