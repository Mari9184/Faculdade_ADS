//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador,idade,contadorMais50=0;
        double altura, somaAltura=0, media;
        
        for(contador=1; contador<= 10; contador++){
                
            System.out.println("Informe sua idade \n");
            idade = ler.nextInt();
            
            System.out.println("Informe sua altura \n");
            altura = ler.nextDouble();
            
            if(idade>=50){
                somaAltura += altura;
                contadorMais50++;
            }
        }
        
        if (contadorMais50 > 0) {
            media = somaAltura / contadorMais50;
            System.out.println("Altura media de pessos 50+:): " + media);
        } else {
            System.out.println("Não há pessoas 50+.");
        }

    }
}
