package TestPilhaDinamic;

public class MyApp {
    public static void main(String[] args) {
        ListaDuplaCircular lista = new ListaDuplaCircular();
        lista.inserir(87);
        lista.inserir(37);
        lista.inserir(90);
        lista.inserir(38);
        lista.inserir(976);
        lista.exibirNaOrdem();
    }
}
