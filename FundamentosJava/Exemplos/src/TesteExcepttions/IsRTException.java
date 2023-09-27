package TesteExcepttions;

public class IsRTException  extends  RuntimeException{
    public IsRTException(String str){
        super("ISI" +str);
    }
}
