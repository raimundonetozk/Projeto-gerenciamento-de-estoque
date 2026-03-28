package produtos;

public class Estoque{
	private ProdutoFisico[] produtos;
	private int contador;
	
	Estoque(int tamanho){
		this.produtos = new ProdutoFisico[tamanho];
		this.contador = 0;
	}
	
	public void adicionarProduto(Produto p) {
		if(contador < produtos.length) {
			produtos[contador] = p;
			contador++;
		}
		System.out.println("O estoque está cheio!");
	}
	
	public void mostrarProduto(Produto p) {
		for(int i=0; contador > i; i++ ) {
			System.out.println("Nome: " + produtos[i].getNome());
            System.out.println("Preço: " + produtos[i].getPreco());
            System.out.println("Quantidade: " + produtos[i].getQuantidade());
            System.out.println("Valor: " + produtos[i].calcularValor());
		}
	}
	
	public void removerProduto(String nome) {
		for(int i=0; i<contador; i++) {
			if(produtos[i].getNome().equalsIgnoreCase(nome)) {
				for(int j = i; j < contador - 1; j++) {
					produtos[j] = produtos[j + 1];
				}
				
				contador++;
				System.out.println("Produto removido!");
			}
			
		}
		System.out.println("Produto não encontrado. O produto não está no estoque ou foi inserido o nome errado.");
	}
	
	public double valorTotal() {
		double total = 0;
		for(int i=0; i< contador; i++) {
			total+= produtos[i].calcularValor();
		}
		return total;
	}
	
}
