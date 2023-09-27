package TesteExcepttions;

import TesteExcepttions.IsRTException;

public class MeuBusiness {
    public static void metodoLancador (String str ) throws Exception {

        if(str!= null){
            System.out.println("Teste " + str);
        }
        else{
            throw new Exception("Ixe deu ruim no método Lançador!! ");
        }
    }
    public static  void outraMetodoLancador(String str){

        if(str!= null){
            System.out.println("Teste " + str);
        }
        else{
            throw new IsRTException("Ixe deu ruim no OUTRO método!! ");
        }
    }
}
