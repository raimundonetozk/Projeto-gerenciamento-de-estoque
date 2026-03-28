package produtos;
import java.util.Scanner;

public class Menu {
	private Estoque estoque;
	private Scanner sc;
	
	public Menu() {
		sc = new Scanner(System.in);
		System.out.println("Insira o tamanho do estoque: ");
		int tamanho = sc.nextInt();
		estoque = new Estoque(tamanho);
	}
	
	public void executar() {
		int op;
		
		do {
			System.out.println("Escolha o que deseja gerenciar no estoque:");
			System.out.println("1 para adicionar produto.");
			System.out.println("2 para remover produto.");
			System.out.println("3 para listar(mostrar) os produtos.");
			System.out.println("4 para mostrar o valor total dos produtos.");
			System.out.println("0 para sair");
			op = sc.nextInt();
			System.out.println("");
			
			switch(op) {
				case 1:
					adicionar();
					break;
				case 2:
					remover();
					break;
				case 3:
					estoque.mostrarProduto();
					break;
				case 4:
					System.out.println("Valor total: " + estoque.valorTotal());
					break;
				default:
					System.out.println("Opção incorreta! Por favor tente novamente.");			}
		} while(op != 0);
		
	}
	private void adicionar() {
		sc.nextLine();
		
		System.out.println("Insira o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.println("Insira o preço do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println("Insira a quantidade de produtos que serão adicionados: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Insira a unidade de medida do produto (Kg, unidade, Lt, etc..): ");
		String unidadeMedida = sc.nextLine();
		
		Produto p = new ProdutoFisico(nome, preco, quantidade, unidadeMedida);
		estoque.adicionarProduto(p);
	}
	
	private void remover() {
		sc.nextLine();
		System.out.println("Insira o nome do produto que deseja remover do estoque: ");
		String nome = sc.nextLine();
		
		estoque.removerProduto(nome);
		
	}
	
}
