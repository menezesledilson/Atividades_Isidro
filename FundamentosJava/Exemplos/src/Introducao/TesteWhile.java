package Introducao;

import java.util.Scanner;

public class TesteWhile {
    public static void main(String[] args) {
        int valor;
        int contador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println("Contando de 1  até no valor --------");

        contador = 1;
        while (contador <= valor){
            System.out.println("Valor do contador = " +contador);
            contador++;
        }
    }
}
