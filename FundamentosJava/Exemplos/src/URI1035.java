import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D;


        /* && - and os dois verdadeiros
           || - OR quando um é verdadeiro e outro falso
           !a - not
    */

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ((B > D) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0 ) && (A%2 == 0 ) ){
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores não aceitos");
        }
    }

}
