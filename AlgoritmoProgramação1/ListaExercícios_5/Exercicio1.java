//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
	    Scanner ler = new Scanner(System.in);
	    int[] number = new int[10];
	    
		
		for (int i=0; i<10; i++){
		    System.out.println("\nInforme um numero:"+(i));
            number[i] = ler.nextInt();
		}
		
		System.out.println("\n_____ Imprimindo números _____");
		    for(int i=0; i<10; i++){
		    System.out.println(number[i]);
		 }
        
        ler.close();
	}
}
