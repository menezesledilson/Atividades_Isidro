package TestFila;

public class AppBanco {
    public static void main(String[] args) {
        Fila f;
        int e;
        f = new Fila();

        f.inserir(176);
        f.inserir(914);
        f.inserir(12);
        f.inserir(1816);
        f.inserir(100);
        System.out.println("Bem vindo ao Banco");
        System.out.println("Servimos bem para servir sempre!");
        System.out.println("Atendimento--------------------");
        while (!f.isEmpty()){
            e = f.retirar();
            System.out.println("Senha  ser atendida no guiche: "+e);
        }
    }
}
