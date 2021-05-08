package roteiro6.parte3;

public class Produto {
	private int id;
	private String nome;
	private double preco;

	public Produto(int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Id : " + this.id + "\n" + "Nome : " + this.nome + "\n" + "Preço : " + this.preco + "\n";
	}

	public double getPreco() {
		return this.preco;
	}

	public int getId() {
		return this.id;
	}
}