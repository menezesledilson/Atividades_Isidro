package Poliformismo.Quest;

public class QuestaoSimples {
    protected String enuciado;
    protected String resposta;

    public QuestaoSimples(String e, String r) {
        this.enuciado = e;
        this.resposta = r;
    }

    public String aplicarQuestao() {
        return "P: " + enuciado;
    }

    public boolean corrigir(String resposta) {
        return this.resposta.equals(resposta);
    }
}
