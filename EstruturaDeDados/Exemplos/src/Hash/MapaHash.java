package Hash;

public class MapaHash {
    private Registro valores[];

    public MapaHash(int tamanho) {
        this.valores = new Registro[tamanho];
    }

    public void put(Registro registro) {
        int posicao = registro.hashCode();
        if (valores[posicao] == null) {
            valores[posicao] = registro;
        } else {
            Registro reg = valores[posicao];
            while (reg.getProximo() != null) {
                if (reg.getKey() == registro.getKey()) {
                    reg.setValue(registro.getValue());
                } else {
                    reg = reg.getProximo();
                }
            }
        }
        registro.setProximo(registro); // coloquei registro na ultima posicao
    }

    public Registro get(int key) {
        Registro r = new Registro();
        r.setKey(key);
        int posicao = r.hashCode();

        if (valores[posicao] != null && valores[posicao].getKey() == key) {
            return valores[posicao];
        } else {
            return null; // Retorna null se o valor não for encontrado na posição
        }
    }
}

