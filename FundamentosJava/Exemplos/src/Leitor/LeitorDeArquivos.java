package Leitor;

import Leitura.Player01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeitorDeArquivos {
    public static void main(String[] args) {
        try {
            File tmpArquivo = new File(" arquivo.txt");
            FileReader rdArquivo = new FileReader(tmpArquivo);

            BufferedReader br = new BufferedReader(rdArquivo);
            String linha;

            while ( (linha = br.readLine() )!= null){
                String infos[] = linha.split(";");
                Player01 p = new Player01(Integer.parseInt(infos[0]),infos[1],Float.parseFloat(infos[2]) );
                System.out.println("Lido"+p.showInfo());
            }
            br.close();
            rdArquivo.close();

        } catch (Exception ex) {
            System.out.println("ERRO" + ex.getMessage());
        }
    }
}
