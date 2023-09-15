import java.util.Scanner;

public class TesteBreakContinue {
    public static void main(String[] args) {
        int valor;
        int contador;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor ");
        valor = teclado.nextInt();

        for(contador = 1; contador <= valor; contador++ ){
            if(contador == 5){
               // break;
                continue;
            }
            System.out.println(" contador = "+contador);
        }
        System.out.println("Fim do programa");
    }
}
