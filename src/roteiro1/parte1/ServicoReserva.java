package roteiro1.parte1;

public class ServicoReserva {
    private MySqlConnection connection;

    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }

}
