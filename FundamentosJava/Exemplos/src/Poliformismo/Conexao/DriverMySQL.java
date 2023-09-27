package Poliformismo.Conexao;

public class DriverMySQL implements InterfaceBD {
    public void conectar (String servidor){
        System.out.println("MYSQL> Connecting on" +servidor);
    }
    public void executar (String SQL){
        System.out.println("MYSQL>" +SQL + "Excuted");
    }
}
