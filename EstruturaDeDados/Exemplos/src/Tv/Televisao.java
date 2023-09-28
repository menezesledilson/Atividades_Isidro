package Tv;

public class Televisao{
	String marca;
	boolean ligado;
	int volume;
	int canal;

public Televisao(){
	ligado = false;
}

public void ligar(){
	ligado = true;
	System.out.println ("Tv" +marca+ "ligada!");
}
public void desligar(){
	System.out.println ("Tv" +marca+ "ligada!");
	ligado = false;
}

public void definiMarca(String nomeMarca){
	marca = nomeMarca;
	System.out.println("TV - Marca Definida: "+marca);
}
public void defineVolume(int vol){
	if (ligado){
		volume = vol;
		System.out.println("Tv " + marca + "volume definido para "+ volume);

	}
	else{
		System.out.println ("Por favor, ligue antes a TV "+marca);
	}
}
public void defineCanal(int ca){
 if (ligado){
 	canal = ca;
 	System.out.println("Tv" + marca+ "com canal defindo para"+ canal );
 }
 else{
 	System.out.println("Por favor, ligue antes a Tv"+ marca );
 }
}
public void aumentaVolume(int i){
	volume++;
	System.out.println("Tv" + marca + ": volume atual"+volume);
}

    public void defineMarca(String samsung) {
    }
}