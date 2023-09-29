package TestPilhaDinamic;

public class CaixinhaDupla {
    private int elemento03;
    private CaixinhaDupla anterior;
    private CaixinhaDupla proximo;

    public void setElemento (int elemento03){
        this.elemento03 = elemento03;
    }
    public void setAnterior(CaixinhaDupla anterior){
        this.anterior =anterior;
    }
    public void setProximo(CaixinhaDupla proximo){
        this.proximo = proximo;
    }
    public int getElemento03(){
        return  this.elemento03;
    }
    public CaixinhaDupla getAnterior(){
        return  this.anterior;
    }
    public CaixinhaDupla getProximo() {
        return this.proximo;
    }

}
