//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int aluno, aprovados=0, exames=0, reprovados=0;
        double nota1, nota2, media, medias=0, mediaClasse;
        
        for(aluno=1; aluno<= 6; aluno++){
                
            System.out.print("\nInforme 1°nota: ");
            nota1 = ler.nextDouble();
            
            System.out.print("\nInforme 2°nota: ");
            nota2 = ler.nextDouble();
            
            media = (nota1+nota2)/2;
            
            medias += media;
            
            if (media <= 3) {
                System.out.println("\nREPROVADO");
                reprovados++;
            } else if (media > 3 && media < 7) {
                System.out.println("\nEXAME");
                exames++;
            } else {
                System.out.println("\nAPROVADO");
                aprovados++;
            }            
                System.out.println("\n________________________");
        }
        
        mediaClasse = medias/6;
        
        System.out.println("Aprovados:"+aprovados);
        System.out.println("Exames:"+exames);
        System.out.println("Reprovados:"+reprovados);
        System.out.println("Media da Classe:"+mediaClasse);
    }
}
