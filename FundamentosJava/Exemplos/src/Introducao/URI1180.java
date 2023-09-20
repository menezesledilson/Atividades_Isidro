package Introducao;

import java.util.Scanner;

public class URI1180 {
    public static void main(String[] args) {
        int X[],N;
        int menor, posMenor = 0;
        Scanner teclado = new Scanner(System.in);

        N = teclado.nextInt();
        X = new int[N];
        for (int pos = 0; pos <  X.length; pos++ ){
            X[pos] = teclado.nextInt();
        }
        menor = X [0]; // Tenho um valor de refencia

        for (int pos = 0; pos <X.length; pos++){
            if (X [pos] < menor){
                menor = X [pos];
                posMenor = pos;
            }
        }
        System.out.println("Menor Valor " + menor);
        System.out.println("Posição: " +posMenor);
    }
}
