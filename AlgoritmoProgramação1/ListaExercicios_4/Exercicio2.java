//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1, numero, resto, par = 0, impar = 0;

        while (contador <= 10) {
            System.out.printf("Digite o %dº numero: ", contador);
            numero = ler.nextInt();

            resto = numero % 2;

            if (resto == 1) {
                System.out.println("O numero " + numero + " é impar");
                impar ++;
            } else {
                System.out.println("O numero " + numero + " é par");
                par ++;
            }

            contador++;
        }
        
        System.out.printf("\nQuantidade de numeros:\n impares: %d \n pares: %d", impar, par);
    }
}
