package Poliformismo.Client;

public class AppLoja {
    public static void main(String[] args) {
        Cliente[] clientes;
        clientes = new Cliente[5];

        clientes[0] = new Cliente("Isidro","isidro@gmail",500);
        clientes[1] = new ClienteVIP("Vitor","vitor@gmail", 300);
        clientes[2] = new ClienteVIP("Andre","andre@gmail", 1000);
        clientes[3] = new ClienteVIP("Jose","jose@gmail", 1000);
        clientes[4] = new ClienteVIP("pedro","pedro@gmail", 1050);

        for (Cliente c: clientes) {
            System.out.println(c);

        }

//        //Vou Comprar
//        if(v.fazerComprar(650)){
//            System.out.println("Consegiu comprar");
//        } else{
//            System.out.println("Saldo insuficiente ");
//        }
//        System.out.println(c);
//
}
}
