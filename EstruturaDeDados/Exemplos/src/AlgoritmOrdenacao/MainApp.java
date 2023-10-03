package AlgoritmOrdenacao;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

      int vetor[] = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }

        AlgoritmoDeOrdenacao alg = new AlgoritmoDeOrdenacao();
        alg.setVetor(vetor);
        //alg.bubbleSort(vetor);

        alg.selectionSort();
        alg.mostraVetor();
    }
}
