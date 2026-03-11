//Mariane Santana da Silva RA:1143431607

import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        //7° Exercício

        double Calculo1 = (20.0-15.0)/2.0;
        double Calculo2 = Math.pow(2, 5/20.0);
        Calculo2 = Calculo2 +30/ Math.pow(15,2);
        double Calculo3 = 35.0/(6+2);
        double Calculo4 = 23%4;

        System.out.printf("\nO resultado do 1° calculo é %f",Calculo1);
        System.out.printf("\nO resultado do 2° calculo é %f",Calculo2);
        System.out.printf("\nO resultado do 3° calculo é %f",Calculo3);
        System.out.printf("\nO resultado do 4° calculo é %f",Calculo4);
    }
}
