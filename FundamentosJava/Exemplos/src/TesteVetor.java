import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String vetor [];

        vetor = new String[10];

        System.out.println("Digite 10 strings diferentes ");
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] = teclado.nextLine();
        }

        System.out.println("------------------------");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor [ " + i +"] =  " +vetor[i] );
        }
    }
}
