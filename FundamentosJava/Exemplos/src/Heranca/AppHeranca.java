package Heranca;

import Heranca.Pessoa;

public class AppHeranca{
	public static void main(String args[]){
	    Pessoa p = new Pessoa("Isidro", "isidro@isidro.com");
	    
    
	    Funcionario f = new Funcionario("Josineidson", "josi@isidro.com", 5000);
	    
	    System.out.println("Mostrando infos.....");
	    System.out.println("Pessoa" +p.getNome()+ " - " +p.getEmail());
	    System.out.println("Funcionario: " + f.getNome()+ " - " + f.getEmail() + "- " + f.getSalario());

	}
}