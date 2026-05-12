//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int[] VetorA = new int[5];
		int[] VetorB = new int[5];



		for (int i=0; i<5; i++) {
			System.out.printf("\n %d° Informe um nome: ", i);
			VetorA[i] = ler.nextInt();
		}


        for(int i=0; i<5; i++){
	       VetorB[i] = VetorA[i] * 3;
		}

		System.out.println("\n_____ Multiplicando por 3 _____");

		for(int i=0; i<5; i++) {

			System.out.println(VetorB[i]);
		}

		ler.close();
	}
}
