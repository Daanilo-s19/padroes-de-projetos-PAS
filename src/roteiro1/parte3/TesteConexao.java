package roteiro1.parte3;

public class TesteConexao {
    public static void main(String args) {
        ServicoQuarto servicoQuarto_mySql = new ServicoQuarto(new MySqlConnection());
        servicoQuarto_mySql.verificarQuarto();
        ServicoQuarto servicoQuarto_oracle = new ServicoQuarto(new OracleConnection());
        servicoQuarto_oracle.verificarQuarto();

        ServicoReserva servicoReserva = new ServicoReserva();
        servicoReserva.criarReserva();

        RelatorioReserva relatorioReserva = new RelatorioReserva();
        relatorioReserva.gerarRelatorio();
    }
}
