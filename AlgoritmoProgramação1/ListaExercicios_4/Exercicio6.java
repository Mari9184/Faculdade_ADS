//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1, numero, menor = 0;

        while (contador <= 3) {
            System.out.printf("Digite o %dº numero: ", contador);
            numero = ler.nextInt();

            if (contador == 1) {
                menor = numero;
            } 
            else if (numero < menor) {
                    menor = numero;
            }

            contador++;
        }

        System.out.printf("Este é o menor numero: %d%n", menor);
    }
}
