package roteiro1.parte1;

public class ServicoQuarto {
    private MySqlConnection connection;

    public ServicoQuarto() {
        this.connection = new MySqlConnection();
    }

    public void verificarQuarto() {
        this.connection.connect();
        System.out.println("Lógica de negócio para o Serviço de Quarto");
    }
}
