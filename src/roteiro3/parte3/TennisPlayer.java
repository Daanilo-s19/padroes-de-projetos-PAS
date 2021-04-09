package roteiro3.parte3;

public class TennisPlayer extends Player implements Runnable {
    public TennisPlayer(String nome) {
        super(nome);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " Rebate a bola por cima do oponente");
    }

    @Override
    public void correr() {
        // TODO Auto-generated method stub

    }
}