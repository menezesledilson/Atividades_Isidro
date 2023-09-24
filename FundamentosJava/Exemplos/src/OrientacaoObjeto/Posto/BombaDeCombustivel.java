package OrientacaoObjeto.Posto;

public class BombaDeCombustivel {
    private String combustivel;
    private float precoLitro;
    private float qtdeLitros;
    private float valorTotal;
    private boolean emAbastecimento;

    public BombaDeCombustivel(String combustivel, float preco) {
        this.combustivel = combustivel;
        this.precoLitro = preco;
        this.qtdeLitros = 0f;
        this.valorTotal = 0f;
        this.emAbastecimento = false;
    }

    public void puxaGancho() {
        this.emAbastecimento = true;
        this.valorTotal = 0.0f;
        this.qtdeLitros = 0.0f;
        System.out.println("Bomba" + this.combustivel + "Pronta para abastecer");
    }

    public void voltaGancho() {
        this.emAbastecimento = false;
        System.out.println("+-----------------------------------+");
        System.out.println("|Posto do Isidro - Recibo");
        System.out.println("+-----------------------------------+");
        System.out.println("|Combustivel: " + this.combustivel);
        System.out.println("|Preço do litro R$ " + this.precoLitro);
        System.out.println("|Litros " + this.qtdeLitros);
        System.out.println("|Valor Total R$ " + this.valorTotal);
        System.out.println("+-----------------------------------+");
    }

    public void abastecerPorLitros(float litros) {
        if (this.emAbastecimento) {
            this.qtdeLitros = litros;
            this.valorTotal = this.qtdeLitros * this.precoLitro;
            System.out.println("Bomba" + combustivel + "em abastecimento");
        } else {
            System.out.println("Tire o bico do gancho");
        }

    }

    public void abastecerPorValor(float valor) {
        if (this.emAbastecimento) {
            this.valorTotal = valor;
            this.qtdeLitros = this.valorTotal / this.precoLitro;
            System.out.println("Bomba" + combustivel + "em abastecimento");
        } else {
            System.out.println("Tire o bico do gancho ");
        }
    }
}
