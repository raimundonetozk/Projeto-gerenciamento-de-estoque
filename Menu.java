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
			System.out.println("-------------------------------------------");
			System.out.println("Escolha o que deseja gerenciar no estoque:");
			System.out.println("Digite (1) para adicionar um produto no estoque.");
			System.out.println("Digite (2) para remover um produto do estoque.");
			System.out.println("Digite (3) para listar(mostrar) todos os produtos em estoque.");
			System.out.println("Digite (4) para mostrar o valor total dos produtos em estoque.");
			System.out.println("Digite (0) para sair");
			op = sc.nextInt();
			System.out.println("-------------------------------------------");
			
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
					System.out.printf("Valor total de todos os produtos em estoque: R$ %.2f reais\n" , estoque.valorTotal());
					break;
				case 0:
					System.out.println("Encerrando o programa...");
					break;
				default:
					System.out.println("Opção inválida! Por favor tente novamente.");			}
		} while(op != 0);
		
	}
	private void adicionar() {
		 if (estoque.estaCheio()) {
	            System.out.println("O estoque está cheio! Não é possível adicionar mais produtos.");
	            return;
	        }
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
