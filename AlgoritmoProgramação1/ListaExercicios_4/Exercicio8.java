//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int aluno = 1;
        double nota1, nota2, media;

        while (aluno <= 5) {
            
            System.out.printf("\n=== Calcule sua Média === ");
            
            do{
                System.out.printf("\nDigite sua 1° nota: ");
                nota1 = ler.nextDouble();
                
                if (nota1 < 0 || nota1 > 10){
                    System.out.println("\n  nota é invalida");
                }
                
            }while (nota1 <= 0 && nota1 >= 10);
            
            do{    
                System.out.printf("\nDigite sua 2° nota:");
                nota2 = ler.nextDouble();
            
                if (nota2 < 0 || nota2 > 10){
                    System.out.println("\n  nota é invalida");
                }
            
            }while (nota2 <= 0 && nota2 >= 10);
                
            media = (nota1+nota2)/2;
                
            if (media >= 0 && media <= 10){
                System.out.printf("\nSua media é %.2f.\n",media);
            }else
                System.out.println("\n Sua media é invalida");
                
            aluno++;
        }
    }
}
