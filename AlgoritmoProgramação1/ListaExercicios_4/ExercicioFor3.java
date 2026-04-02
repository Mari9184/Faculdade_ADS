//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador,numero;
        
        System.out.println("====== Informe um número ======\n");
        numero = ler.nextInt();
        
        System.out.printf("\n====== Sequencia numérica ======\n");
        
        for(contador=1; contador<=numero; contador++){
                
            System.out.println(contador);
        }
    }
}
