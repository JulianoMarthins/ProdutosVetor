package entities;

public class Produto {
	// Atributos
	private String nome;
	private double preco;
	
	// Contrutor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	// Metodos
	
	// Getters & Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}

	// toString

	public String toString() {
		return "\nProduto:\nNome = " + nome + "\nPreco = " + preco;
	}
}
