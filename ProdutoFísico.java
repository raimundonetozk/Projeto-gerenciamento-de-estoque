package produtos;

public class ProdutoFisico extends Produto {

	private String unidadeMedida;
    public ProdutoFisico(String nome, double preco, int quantidade, String unidadeMedida) {
        super(nome, preco, quantidade);
        this.unidadeMedida = unidadeMedida;
    }
    
    @Override
    public double calcularValor() {
        return preco * quantidade;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Unidade: " + unidadeMedida);
        System.out.printf("Valor total de %s em estoque é de R$ %.2f reais\n", nome, (quantidade * preco));
    }  
}
