package roteiro3.parte2;

public class GolfPlayer extends Player {
    public GolfPlayer(String nome) {
        super(nome);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Pontua com o nº de tacadas previstas");
    }

    @Override
    public void correr() { // Sem implementação
    }
}