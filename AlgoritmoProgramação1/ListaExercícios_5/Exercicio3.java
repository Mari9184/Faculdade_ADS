//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
	    Scanner ler = new Scanner(System.in);
	    String[] name = new String[5];
	    
	    
		
		for (int i=0; i<5; i++){
		    System.out.printf("\n %d° Informe um nome: ", i);
            name[i] = ler.nextLine();
		}
		
		System.out.println("\n_____ Nomes em Decrescente _____");
		
		for(int i=4; i>=0; i--){

		    System.out.println(name[i]);
		}
		
		System.out.println("\n_____ Nomes em Crescente _____");
		
		for(int i=0; i<5; i++){
	    
	    	System.out.println(name[i]);
		}
        
        ler.close();
	}
}
