package roteiro4.parte1;

public class Fuzil implements Arma {

    @Override
    public void carregar() {
        System.out.println("Carregando a Fuzil");
    }

    @Override
    public void atirar() {
        System.out.println("Tiro com rifle não falha");
    }

    @Override
    public void mirar() {
        System.out.println("Zoom no alvo");
    }

}
