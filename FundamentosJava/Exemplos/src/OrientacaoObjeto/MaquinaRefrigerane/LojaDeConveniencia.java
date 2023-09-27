package OrientacaoObjeto.MaquinaRefrigerane;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LojaDeConveniencia {
    public static void main(String[] args) {
        MaquinaRefri m = new MaquinaRefri();
        Scanner teclado = new Scanner(System.in);
        int opcao, res;
        float valor;

        do {
            System.out.println(m.mostraInfo());
            System.out.println("Digite 99 para inserir credito");
            System.out.println("Digite -1 para sair");
            System.out.println("ou digite o numero do refri para comprar (0 -4 )");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                   res = m.comprar(opcao);
                   if( res == 0){
                       System.out.println("Enjoy");
                   } else if(res == -1){
                       System.out.println("Saldo Insuficiente. Insira mais R$");
                   } else {
                       System.out.println("Desculpe. Refrigerante em falta. Volte mais tarde ");
                   }
                   break;
                case 99:
                    System.out.println("Digite o valor:");
                    valor = teclado.nextFloat();
                    m.inserirCredito(valor);
                    break;
                case -1:
                    System.out.println("Obrigado por utilizar a maquina ");
                    System.out.println("Receba seu troco " + m.solicitarTroco());
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != -1);

    }
}
