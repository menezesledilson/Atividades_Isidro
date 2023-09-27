package Poliformismo.Client;

public class ClienteVIP  extends Cliente{
    private  float creditoExtra;
    public ClienteVIP(String nome, String email, float creditoExtra) {
        super(nome, email, creditoExtra);
        this.creditoExtra = creditoExtra;
    }
    public String toString(){
        return  "VIP: " +super.toString()+ " Credito Extrar R$ " + creditoExtra;
    }
    public  boolean fazerCompra (float valor){
        if (valor > creditoExtra + super.getCredito()){
           return  false;
        }
        else {
            super.setCredito(super.getCredito() - valor);
            return  true;
        }
    }
}
