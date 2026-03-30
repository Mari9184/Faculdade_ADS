//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador = 1;
        double peso, altura, imc;

        while (contador <= 10) {
            
            System.out.print("=== Calcule seu IMC ===");
            
            System.out.println("\n Digite o seu peso:");
            peso = ler.nextDouble();
            
            System.out.printf("\n o sua altura: \n");
            altura = ler.nextDouble();
        
            imc = peso / (altura*altura);

            if (imc >= 18.5 & imc <= 24.9 )
                System.out.printf("Seu IMC é %.2f, não esta em quadro de obesidade \n ",imc);
            else 
                System.out.printf("Seu IMC é %.2f, esta em quadro de obesidade \n",imc);
            
                
            contador++;
        }
    }
}
