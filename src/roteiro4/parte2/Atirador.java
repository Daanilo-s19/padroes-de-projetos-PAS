package roteiro4.parte2;

public class Atirador {
    private String nome;
    private Arma arma;

    public void carregarArma() {
        System.out.println("Ação - " + this.nome + " : ");
        this.arma.carregar();
    }

    public void fazerMira() {
        System.out.println("Ação - " + this.nome + " : ");
        this.arma.mirar();
    }

    public void usarArma() {
        System.out.println("Ação - " + this.nome + " : ");
        this.arma.atirar();
    }

    public Atirador(String nome, Arma arma) {
        setNome(nome);
        setArma(arma);
    }

    public Arma setArma(Arma arma) {
        return this.arma = arma;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public Arma getArma() {
        return this.arma;
    }

    public String getNome() {
        return this.nome;
    }
}
