package Poliformismo.Conexao;

public class DriverOracle implements InterfaceBD {
    public void conectar(String servidor) {
        System.out.println("Oracle>" + servidor + "Connected ");
    }
    public void executar(String SQL) {
        System.out.println("Oracle> Executing " + SQL);
    }
}
