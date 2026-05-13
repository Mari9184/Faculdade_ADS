//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {

    public static int maior(int[] vetor) {

        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }

    public static int menor(int[] vetor) {

        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return menor;
    }

    public static double media(int[] vetor) {

        int max = maior(vetor);
        int min = menor(vetor);

        return (max + min) / 2.0;
    }
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[5];

        // Leitura do vetor
        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Digite um %d° número: ",i);
            numeros[i] = ler.nextInt();
        }

        // Chamando as funções
        int maior = maior(numeros);
        int menor = menor(numeros);
        double media = media(numeros);

        // Exibindo resultados
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média entre maior e menor: " + media);

        ler.close();
    }
    
}
