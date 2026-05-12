import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int[] VetorA = new int[4];
		int[] VetorB = new int[7];
		int[] VetorC = new int[11];
                    

		System.out.println("\n_____ Vetor A _____");
		for (int i=0; i<4; i++) {
			System.out.printf("\n %d° Informe um nome: ", i+1);
			VetorA[i] = ler.nextInt();
		}
		
		System.out.println("\n_____ Vetor B _____");
		for (int i=0; i<7; i++) {
			System.out.printf("\n %d° Informe um nome: ", i+1);
			VetorB[i] = ler.nextInt();
		}
		
		for (int i = 0; i < 4; i++) {
            VetorC[i] = VetorA[i];
        }

        for (int i = 0; i < 7; i++) {
            VetorC[i+4] = VetorB[i];
        }

		System.out.println("\n_____ Vetor C  _____");

		for(int i=0; i<11; i++) {

			System.out.println(VetorC[i]);
		}
		
		ler.close();
	}
}
