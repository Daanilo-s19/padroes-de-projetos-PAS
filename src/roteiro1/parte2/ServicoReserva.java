package roteiro1.parte2;

public class ServicoReserva {
    private OracleConnection connection;

    public void criarReserva() {
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }

}
