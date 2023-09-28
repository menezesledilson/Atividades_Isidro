package TestPilha;

public class Conversor {
    public static void main(String args[]) {
        int numero = Integer.parseInt(args[0]);
        Pilha p = new Pilha();
        int resto;

        while (numero != 0) {
            resto = numero % 2; // pego o resto da devisao número por 2 (valoe 0 ou 1)
            p.push(resto); //armazena a pilha
            numero = numero / 2; // gero um novo número, resultado da divisao dele por 2
        }
        // fase 2 = exibicao dos restos
        while (!p.isEmpty()) {
            resto = p.pop();   // remove da pilha (sempre o cara que está no topo)
            System.out.println(resto);
        }
        System.out.println("Fim do programa");
    }
}
