package roteiro3.parte3;

public class GolfPlayer extends Player implements Runnable {
    public GolfPlayer(String nome) {
        super(nome);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Pontua com o nº de tacadas previstas");
    }

    @Override
    public void correr() {
        // TODO Auto-generated method stub

    }

}