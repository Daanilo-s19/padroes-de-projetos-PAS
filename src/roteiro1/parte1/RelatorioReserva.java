package roteiro1.parte1;

public class RelatorioReserva {
    private MySqlConnection connection;

    public void gerarRelatorio() {
        this.connection.connect();
        System.out.println("Lógica de negócio para geração do relatório");
    }
}
