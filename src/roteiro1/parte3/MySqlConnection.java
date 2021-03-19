package roteiro1.parte3;

public class MySqlConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectando com o MySQL");
    }

}
