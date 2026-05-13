//Mariane Santana da Silva RA:1143431607
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        if (isPas(numero)){

            System.out.println("Número par");
        }
        else{
            System.out.println("Número impar");
        }
    }

    public static boolean isPas(int num1){
    
        if (num1 % 2 ==0) {
            return true;
        } 
        else {
            return false;
        }    
    }
}
