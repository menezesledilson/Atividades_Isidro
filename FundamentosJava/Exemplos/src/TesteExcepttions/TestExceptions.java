package TesteExcepttions;

public class TestExceptions {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int c = a / b;
            System.out.println("Resultado da divisao =" + c);

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException  ex) {
            System.err.println("Plis, informe 2 valores ");

        } catch (ArithmeticException ex) {
            System.err.println("Plis, não da pra divider por zeroooooooooooooooooo ");
        } catch (Exception ex) {
            System.err.println("Deu Ruim");
        } finally {
            System.out.println("Cheguei no finally... posso fazer algo aqui");
        }
    }
}
