public class TestArgs {
    public static void main(String[] args) {
//        System.out.println("tamanho do vetor args " + args.length);
//        System.out.println("E quais os valores ");
//        for (int i = 0; i < args.length; i++){
//            System.out.println("args [ " + i + "] = " +args[i]);
//        }
//    }

        float a, b, media;
        if (args.length < 2 ){
            System.out.println("help execute: java teste Args");
        }
        else {
            a = Float.parseFloat(args[0]);
            b = Float.parseFloat(args[1]);
            media = (a+b)/2;
            System.out.println("info" +media);
        }
    }
}
