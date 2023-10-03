package Arvore;

public class AppQueusaArvore {
    public static void main(String[] args) {
        Arvores arvores = new Arvores(new Elemento(10));
        arvores.inserir(new Elemento(5));
        arvores.inserir(new Elemento(1));
        arvores.inserir(new Elemento(8));
        arvores.inserir(new Elemento(15));
        arvores.inserir(new Elemento(12));
        arvores.inserir(new Elemento(18));

        arvores.imprimirPreOrdem();
        System.out.println(" ");

        arvores.imprimirInOrdem();
        System.out.println(" ");

        arvores.imprimirPosOrdem();
        System.out.println(" ");
    }
}
