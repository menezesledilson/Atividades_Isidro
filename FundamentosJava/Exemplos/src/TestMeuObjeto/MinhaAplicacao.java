package TestMeuObjeto;

public class MinhaAplicacao {

    public static void main(String args[]){
        MeuObjeto o = new MeuObjeto();
        // o.metodoDoObjeto(new MinhaInterface(){
        // 	public void metodoDaInterface(){
        // 		System.out.println("Metodo da interface executando");
        // 	}
        // });

        // o.metodoDoObjeto(() -> System.out.println("Opa.. executando de novo"));

        // System.out.println("Fim do programa");

        o.outroMetodoDoObjeto(() -> {
                    System.out.println("Valor do E="+e);
                    System.out.println("Valor do F="+f);
                },
                Integer.parseInt(args[0]),
                Float.parseFloat(args[1]));

    }
}
