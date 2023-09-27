package TesteExcepttions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestOrdenado {
    public static void main(String[] args) {
        ArrayList <String> listaNomes = new ArrayList<String>();

        listaNomes.add("Isidro");
        listaNomes.add("Zelia");
        listaNomes.add("Adriano");
        listaNomes.add("Jose");
        listaNomes.add("Pedro");

        System.out.println("****Imprimindo a lista *****");

        Collections.sort(listaNomes);

        for(String s: listaNomes){
            System.out.println("Nomes: " + s);
        }
////        String s1 = "Jose";
////        String s2 = "Isidro";
//        System.out.println("Resutlado da comparacao: "+ s);
    }
}
