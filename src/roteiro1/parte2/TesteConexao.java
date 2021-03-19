package roteiro1.parte2;

public class TesteConexao {
    public static void main(String args) {
        ServicoQuarto servicoQuarto = new ServicoQuarto();
        servicoQuarto.verificarQuarto();
        ServicoReserva servicoReserva = new ServicoReserva();
        servicoReserva.criarReserva();

        RelatorioReserva relatorioReserva = new RelatorioReserva();
        relatorioReserva.gerarRelatorio();
    }
}
