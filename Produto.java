package produtos;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;
    protected String unidadeMedida;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { 
    	return nome; 
    }
    
    public double getPreco() { 
    	return preco; 
    }
    public int getQuantidade() { 
    	return quantidade; 
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: R$ " + preco);
    }    
    
    public abstract double calcularValor();
}
