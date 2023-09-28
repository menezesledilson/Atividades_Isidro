package TestMeuObjeto;

public class MeuObjeto {
	public void metodoDoObjeto(InterfaceFuncional m) {
		System.out.println("Estou dentro do método do objeto...");
		m.executaMetodo(); // Aqui você deve chamar o método corretamente
	}

	public void outroMetodoDoObjeto(InterfaceFuncional m2, int valor, float valor2) {
		m2.executaMetodo();
	}
}
