package entities;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto() {}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public static boolean predicadoProdutoStatico(Produto p ) {//usa o produto passado por parametro
		return p.getPreco()>=100.00;
	}
	
	public boolean predicadoProdutoNaoStatico() {//usa o produto definido na propria classe
		return preco>=100.00;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
