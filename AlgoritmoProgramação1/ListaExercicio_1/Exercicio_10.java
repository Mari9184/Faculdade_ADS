//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        //Exercício 10

        System.out.printf("\n Informe o valor do lado do quadrado que deseja calcular:");
        double F = ler.nextDouble();
        double Quadrado = F*F;

        System.out.printf("\n O valor do do quadrado é:"+Quadrado);
      
    }
}
