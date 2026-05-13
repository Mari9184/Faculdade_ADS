//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("1° Numero: ");
        int numero1 = ler.nextInt();

        System.out.println("2° Numero: ");
        int numero2 = ler.nextInt();

        int maior = encontrarMax (numero1, numero2);

        System.out.println("O maior número é: " +maior);

        ler.close();
    }

    public static int encontrarMax(int num1, int num2){
    
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }    
    }
}
