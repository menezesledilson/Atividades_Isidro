import java.util.Scanner;

public class TesteFor {
    public static void main(String[] args) {
        int valor;
        int contador;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até o valor ----");
        for (contador = 1; contador <= valor; contador++) {
            System.out.println("Valor do contador " + contador);
        }
    }
}