package TestPilhaDinamic;

public class PilhaDinamica {
    private Caixinha01 topo;

    public PilhaDinamica() {
        topo = null;

    }
    public void push(int elemento) {
        Caixinha01 novo = new Caixinha01();
        int elemento01 = 0;
        novo.setElemento01(elemento01);
        novo.setProximo01(topo);

        topo = novo;
    }
    public Caixinha01 pop() {
 Caixinha01 elemento = topo.getProximo02();
 topo.setProximo01(topo.getProximo02());
 return  elemento;
    }
    public boolean isEmpty() {
        return (topo == null);
    }
}
