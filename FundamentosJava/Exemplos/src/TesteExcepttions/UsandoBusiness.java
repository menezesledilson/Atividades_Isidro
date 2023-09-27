package TesteExcepttions;

import TesteExcepttions.MeuBusiness;

public class UsandoBusiness {
    public static void main(String[] args) throws Exception {
        try{
        MeuBusiness.metodoLancador("OI");
        MeuBusiness.outraMetodoLancador(null);
    }
    catch(
    Exception ex)

    {
        System.err.println("Ops... algum problema...");

        throw new Exception("Repassando a buxa");
    }
}
}