import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int[] VetorA = new int[5];
		int[] VetorB = new int[5];
        int[] VetorC = new int[5];

		System.out.println("\n_____ Vetor A _____");
		for (int i=0; i<5; i++) {
			System.out.printf("\n %d° Informe um nome: ", i);
			VetorA[i] = ler.nextInt();
		}
		
		System.out.println("\n_____ Vetor B _____");
		for (int i=0; i<5; i++) {
			System.out.printf("\n %d° Informe um nome: ", i);
			VetorB[i] = ler.nextInt();
		}


        for(int i=0; i<5; i++){
	       VetorC[i] = (VetorA[i])-(VetorB[i]);
		}

		System.out.println("\n_____ Vetor C - Subtração _____");

		for(int i=0; i<5; i++) {

			System.out.println(VetorC[i]);
		}
		
		ler.close();
	}
}
