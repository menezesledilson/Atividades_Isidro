package Poliformismo.Quest;

public class QuestaoComDica extends QuestaoSimples {
    private String dica;
    public QuestaoComDica (String e, String r, String dica){
        super(e, r);
        this.dica = dica;
    }
    public String aplicarQuestao(){
        return  "P: " + super.enuciado + "\n (dica)" + dica;
    }

}
