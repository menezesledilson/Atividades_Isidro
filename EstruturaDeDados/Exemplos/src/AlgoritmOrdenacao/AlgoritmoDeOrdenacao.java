package AlgoritmOrdenacao;

public class AlgoritmoDeOrdenacao {

    private int vetor[] = {25, 57, 48, 37, 12, 92, 33};

    public void setVetor(int vetor[]) {
        this.vetor = vetor;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void bubbleSort() {
        int it; // número de iterações
        int pos; // sempre uso a posição atual
        int temp; // variável para a troca

        for (it = 0; it < vetor.length - 1; it++) {
            for (pos = 0; pos < vetor.length - it - 1; pos++) {
                if (vetor[pos] > vetor[pos + 1]) {
                    // o elemento atual é maior que seu próximo, então troca
                    temp = vetor[pos];
                    vetor[pos] = vetor[pos + 1];
                    vetor[pos + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int it, temp;
        int posMenor;
        int i;

        for (it = 0; it < vetor.length - 1; it++) {
            posMenor = it;
            for (i = it + 1; i < vetor.length; i++) {
                if (vetor[i] < vetor[posMenor]) {
                    posMenor = i;
                }
            }
            if (posMenor != it) {
                // troca
                temp = vetor[it];
                vetor[it] = vetor[posMenor];
                vetor[posMenor] = temp;
            }
        }
    }

    public void insertionSort() {
        int carta, it, j;

        for (it = 1; it < vetor.length; it++) {
            carta = vetor[it];
            j = it - 1;

            // puxa todos os elementos que são maiores
            while (j >= 0 && vetor[j] > carta) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = carta;
        }
    }

    public void mostraVetor() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      AlgoritmoDeOrdenacao algoritmo = new AlgoritmoDeOrdenacao();
        System.out.println("Vetor original:");
        algoritmo.mostraVetor();

        // Testando os algoritmos de ordenação
        algoritmo.bubbleSort();
        System.out.println("Após Bubble Sort:");
        algoritmo.mostraVetor();

        // Reinicializando o vetor para testar os outros algoritmos
        int novoVetor[] = {25, 57, 48, 37, 12, 92, 33};
        algoritmo.setVetor(novoVetor);

        algoritmo.selectionSort();
        System.out.println("Após Selection Sort:");
        algoritmo.mostraVetor();

        // Reinicializando o vetor para testar o último algoritmo
        int outroVetor[] = {25, 57, 48, 37, 12, 92, 33};
        algoritmo.setVetor(outroVetor);

        algoritmo.insertionSort();
        System.out.println("Após Insertion Sort:");
        algoritmo.mostraVetor();
    }
}
