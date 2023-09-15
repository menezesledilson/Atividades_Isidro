import java.util.Scanner;

public class URI1064 {
    private static float valor;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor;
        float media;
        float cont;

        media = 0f;
        cont = 0;

        for (int i = 1; i <= 6; i++) {
            valor = teclado.nextFloat();
            if (valor > 0) {
                media += valor;
                cont++;
            }
        }
        media =  media /cont;
        System.out.println(cont + "  valores positivos  ");
        System.out.println("%.1f\n"+ media);
    }
}
