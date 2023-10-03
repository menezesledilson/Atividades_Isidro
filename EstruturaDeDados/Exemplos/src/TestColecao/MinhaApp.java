package TestColecao;

import java.util.Scanner;

import java.util.Scanner;

public class MinhaApp {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Colecao colecao = new Colecao();
        int valor, pos;
        do {
            System.out.println("Digite um valor a ser pesquisado (-1 para encerrar):");
            try {
                valor = teclado.nextInt();
                if (valor != -1) {
                    System.out.println(">> Busca Sequencial");
                    pos = colecao.buscaSequencial(valor);
                    if (pos != -1) {
                        System.out.println("Elemento encontrado na posição: " + pos);
                    } else {
                        System.out.println("Elemento não encontrado na busca sequencial.");
                    }

                    System.out.println(">> Busca Binária");
                    pos = colecao.buscaBinaria(valor);
                    if (pos != -1) {
                        System.out.println("Elemento encontrado na posição: " + pos);
                    } else {
                        System.out.println("Elemento não encontrado na busca binária.");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                teclado.next(); // Limpar o buffer do scanner
                valor = 0; // Reiniciar o valor para evitar loop infinito
            }
        } while (valor != -1);
    }
}

