package Introducao;

import java.util.Scanner;

public class Meteoros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1, y1, x2, y2; //fazenda
        int x, y;
        int N;
        int contador;

        x1 = teclado.nextInt();
        x2 = teclado.nextInt();
        y1 = teclado.nextInt();
        y2 = teclado.nextInt();

        if (x1 != 0 || y1 != 0 || x2 != 0  ){
            N = teclado.nextInt();
            contador = 0;

            for (int i = 0; i < N; i++) {
                x = teclado.nextInt();
                y = teclado.nextInt();

                if (x >= x1 && x <= x2 && y <= y1) {
                    contador++;
                }
            }
            System.out.println("Teste ");
            System.out.println(contador);
        }
        while (x1 != 0 || y1 != 0 || x2 != 0 || y2 != 0) ;
    }
    }
