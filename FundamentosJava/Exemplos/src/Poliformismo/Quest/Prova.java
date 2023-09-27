package Poliformismo.Quest;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        QuestaoSimples perguntas[];
        perguntas = new QuestaoSimples[5];

        perguntas[0] = new QuestaoSimples("Quem Descobriu  o Brasil?","PA Cabral");
        perguntas[1] = new QuestaoMe("Qual a cor do cavalo branco  do Napoleão ? ", "a", "branco", "marron",
               "preto", "malhado");
        perguntas[2] = new QuestaoComDica("Qual a linguagem do curso", "Java", "Inicia com Ja e termina com va ");
        perguntas[3] = new QuestaoSimples("Qual a formula da agua", "H2O");
        perguntas[4] = new QuestaoMe("Qual o jogo favorito do Isidro", "c", "MegaMan", "Mario", "Zelda", "StreetFighter");

        int pontos = 0;
        System.out.println("*** Prova do Isidro ***");
        for( int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i].aplicarQuestao());
            System.out.println("Sua Resposta");
            String resp = teclado.nextLine();
            if(perguntas[i].corrigir(resp)){
                pontos +=2;
            }
        }
        System.out.println("Sua nota final  vale = "+pontos);
    }

}
