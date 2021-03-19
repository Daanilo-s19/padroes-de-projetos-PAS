package roteiro1.parte2;

public class RelatorioReserva {
    private OracleConnection connection;

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
