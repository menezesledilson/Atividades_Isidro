package OrientacaoObjeto.Enca;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Isidro", "isidro@gmail.com", 2000);
        Pessoa p2 = new Pessoa("Asdrubol", 3000);

        p.exibirDados();

        p.aumentaSalario(15);

        p.exibirDados();

        p2.exibirDados();

    }
}
