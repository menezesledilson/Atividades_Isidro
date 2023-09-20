package OrientacaoObjeto;

public class Televisao {
    String marca;
    boolean ligada;
    int volume;
    int canal;
//metodos??

    void ligar(){
        ligada = true;
        System.out.println("A tv " + marca + " esta ligada");
    }
    void aumentarVolume(){
        if (ligada){
            volume++;
            System.out.println("A tv "+ marca + " esta com volume "+ volume);
        }else {
            System.out.println("Por favor, primeiro ligue a TV " + marca);
        }
    }
     void avancarCanal(){
        if (ligada){
            canal++;
            System.out.println("A tv " + marca + " esta no canal " + canal);
        }
        else{
            System.out.println("Por favor, ligue a tv "+marca);
        }
     }
     void mostrarStatus(){
        
     }
}
