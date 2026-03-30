package produtos;

public class Estoque{
	private Produto[] produtos;
	private int contador;
	
	Estoque(int tamanho){
		produtos = new Produto[tamanho];
		contador = 0;
	}
	
	public boolean estaCheio() {
	    return contador >= produtos.length;
	}
	
	public void adicionarProduto(Produto p) {
		if(contador < produtos.length) {
			produtos[contador] = p;
			contador++;
		}
		else{
			System.out.println("O estoque está cheio!");
			System.out.println("");
		}
	}
	
	public void mostrarProduto() {
		for(int i=0; contador > i; i++ ) {
			produtos[i].exibirInformacoes();
            System.out.println("-------------------");
		}
	}
	
	public void removerProduto(String nome) {
		for(int i=0; i<contador; i++) {
			if(produtos[i].getNome().equalsIgnoreCase(nome)) {
				for(int j = i; j < contador - 1; j++) {
					produtos[j] = produtos[j + 1];
				}
				
				contador--;
				System.out.println("Produto removido!");
				System.out.println("");
				return;
			}
			
		}
		System.out.println("Produto não encontrado. O produto não está no estoque ou foi inserido um nome que não corresponde aos que tem no estoque.");
		System.out.println("");
	}
	
	public double valorTotal() {
		double total = 0;
		for(int i=0; i< contador; i++) {
			total+= produtos[i].calcularValor();
		}
		return total;
	}
	
}
