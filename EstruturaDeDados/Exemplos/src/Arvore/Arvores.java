package Arvore;

public class Arvores {
    private Elemento ele;
    private Arvores dir;
    private Arvores esq;

    public Arvores() {
        this.ele = null;
        this.esq = null;
        this.dir = null;
    }

    public Arvores(Elemento elem) {
        this.ele = elem;
        this.dir = null;
        this.esq = null;
        //System.out.println("Criei arvore com o elemento " +elem.getValor());
    }


    //metodos de controle;
    public boolean isEmpty() {
        return (this.ele == null);
    }

    public void imprimirPreOrdem() {
        if (!isEmpty()) {
            System.out.println(this.ele.getValor() + " ");
            if (this.esq != null) {
                this.esq.imprimirPreOrdem();
            }
            if (this.dir != null) {
                this.dir.imprimirPreOrdem();
            }
        }
    }

    public void imprimirInOrdem() {

        if (!isEmpty()) {
            if (this.esq != null) {
                this.esq.imprimirInOrdem();
            }
            System.out.println(this.ele.getValor() + " ");
            if (this.dir != null) {
                this.dir.imprimirInOrdem();
            }
        }
    }

    public void imprimirPosOrdem() {

        if (!isEmpty()) {
            if (this.dir != null) {
                this.dir.imprimirPosOrdem();
            }
            if (this.esq != null) {
                this.esq.imprimirPosOrdem();
            }
            System.out.println(this.ele.getValor() + " ");
        }
    }
    

    public void inserir(Elemento novo) {
        if (isEmpty()) {
            this.ele = novo;
        } else {
            Arvores novaArvore = new Arvores(novo);
            if (novo.getValor() < this.ele.getValor()) {// vou inserir na descendia esquerda
                if (this.esq == null) {
                    this.esq = novaArvore;
                    //System.out.println("Inseri o elemento  "+novo.getValor()+  " à esquerda " + this.ele.getValor());
                } else {
                    this.esq.inserir(novo);//repassei a responsabilidade para sub-árvore esquerda
                }
            } else if (novo.getValor() > this.ele.getValor()) { // vou inserir na descendencia direita
                if (this.dir == null) {
                    this.dir = novaArvore;
                    //System.out.println("Inseri o elemento  "+novo.getValor()+  " à direita de  " + this.ele.getValor());
                } else {
                    this.dir.inserir(novo);
                }
            }
        }
    }

    public boolean busca(int valor) {
        if (isEmpty()) {
            return false;
        }
        if (this.ele.getValor() == valor) {
            return true;
        } else {
            if (valor < this.ele.getValor()) {
                if (this.esq == null) {
                    return false;
                } else {
                    return this.esq.busca(valor); //passei a responsabilidade para subarvore esquerda
                }
            } else if (valor > this.ele.getValor()) {
                if (this.dir == null) {
                    return false;
                } else {
                    return this.dir.busca(valor);
                }
            }
            return false;
        }
    }

    //getter e setter

    public void setElemento(Elemento ele) {
        this.ele = ele;
    }

    public void setDir(Arvores dir) {
        this.dir = dir;
    }

    public void setEle(Arvores esq) {
        this.esq = esq;
    }

    public Elemento getEle() {
        return ele;
    }

    public Arvores getDir() {
        return dir;
    }

    public Arvores getEsq() {
        return esq;
    }
}
