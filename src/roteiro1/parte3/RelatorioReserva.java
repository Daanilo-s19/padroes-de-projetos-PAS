package roteiro1.parte3;

public class RelatorioReserva {
    private Connection connection;

    public void gerarRelatorio() {
        connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
