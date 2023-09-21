package OrientacaoObjeto.TestStatic;

import java.security.PublicKey;

public class Documento {
    private int id;
    private String nome;
    private int status;

    public static int NOVO_DOCUMENTO = 0;
    public static int EM_PROCESSAMENTO = 1;
    public static int AGUARDANDO_AUTORIZACAO = 2;
    public static int FINALZIDO = 3;

    public Documento(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = NOVO_DOCUMENTO;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void exibirDados() {
        System.out.println(id + "." + nome + "(" + status + ")");
    }
}
