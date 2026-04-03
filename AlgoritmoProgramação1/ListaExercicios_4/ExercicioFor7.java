//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador, idade, contMaior50 = 0, contPeso40 = 0, contAltura = 0;
        double altura, peso, somaAltura = 0, mediaAltura = 0, porcentagem;
        

        for ( contador = 1; contador <= 10; contador++) {
            
            System.out.println("\nPessoa " + contador);

            System.out.print("Idade: ");
            idade = ler.nextInt();

            System.out.print("Altura: ");
            altura = ler.nextDouble();

            System.out.print("Peso: ");
            peso = ler.nextDouble();

            if (idade >= 50) {
                contMaior50++;
            } 
            else if(idade >= 10 && idade <= 20) {
                somaAltura += altura;
                contAltura++;
            }
            
            if(peso < 40) {
                contPeso40++;
            }
        }
    
        if (contAltura > 0) {
            mediaAltura = somaAltura / contAltura;
        }
        
        porcentagem = (contPeso40 * 100.0) / 10;

        // Resultados
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Pessoas com mais de 50 anos: " + contMaior50);
        System.out.println("Média das alturas (10 a 20 anos): " + mediaAltura);
        System.out.println("Porcentagem com peso a baixo de 40kg: " + porcentagem + "%");
    }
}
