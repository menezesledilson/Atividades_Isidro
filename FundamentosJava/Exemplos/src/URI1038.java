import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtd, cod;
        float total;
        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        if (cod == 1){
            total = qtd * 4.0f;

        }else {
            if(cod == 2){
                total = qtd * 4.50f;
            }
            else{
                if(cod == 3){
                    total = qtd * 5.0f;
                }
                else{
                    if(cod == 4){
                        total = qtd * 2.0f;
                    }
                    else {
                        total = qtd * 1.5f;
                    }
                }
            }
        }
        System.out.printf("Total: R$  %.2f\n", total);
    }
}
