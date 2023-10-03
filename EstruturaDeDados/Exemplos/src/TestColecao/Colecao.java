package TestColecao;

public class Colecao {
    private int valores[] = {11, 12, 23, 27, 33, 43, 56, 76, 87, 96};

    public int buscaSequencial(int valor) {
        int pos;
        for (pos = 0; pos < valores.length; pos++) {
            if (valor == valores[pos]) {
                return pos;
            }
        }
        return -1;//indicando posição invalidade
    }
    public int buscaBinaria(int valor) {
        int meio, inicio, fim;
        inicio = 0;
        fim = valores.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            // System.out.println("DEBUG - I: " + inicio + " F: " + fim + " M:" + meio);
            if (valor == valores[meio]) {
                return meio;
            } else {
                if (valor > valores[meio]) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }
}
