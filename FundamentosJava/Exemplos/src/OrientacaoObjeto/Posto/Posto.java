package OrientacaoObjeto.Posto;

public class Posto {
    public static void main(String[] args) {
        BombaDeCombustivel b1,b2;
        b1 = new BombaDeCombustivel("Gasolina ",3.99f);
        b2 = new BombaDeCombustivel("Etanol ", 2.39f);

        b1.puxaGancho();
        b1.abastecerPorLitros(20);
        b1.voltaGancho();

        b2.puxaGancho();
        b2.abastecerPorLitros(20);
        b2.voltaGancho();
    }
}
