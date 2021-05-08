package roteiro6.parte1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
	private List<Produto> produtos;
	private List<Cliente> clientes;

	public CarrinhoCompra() {
		this.produtos = new ArrayList<Produto>();
	}

	public double getTotalCompra() {
		double soma = 0;
		for (Produto p : this.produtos) {
			soma = soma + p.getPreco();
		}
		return soma;
	}

	@Override
	public String toString() {
		String result = "";
		for (Produto p : this.produtos) {
			result = result + p.toString();
		}
		return result;
	}

	public void addCliente(Cliente c) {
		this.clientes.add(c);
	}

	public void addProduto(Produto p) {
		this.produtos.add(p);
	}

	public void processarPagamento(Cliente c, double total) {
		System.out.println("Processando o pagamento : \n " + c);
		System.out.println("Pagamento realizado com sucesso ! Total = " + total);
	}

}