//Mariane Santana da Silva RA:1143431607

import java.lang.Math;
import java.util.Scanner;
class Main {
    public static void main (String [] args){

        //Variáveis para os exercícios
        Scanner ler = new Scanner(System.in);
        int Idade=18, RA=1143431607, num=5;
        double Altura=1.61;
        String Nome="Mariane Santana da Silva",Status= "Presente", Curso="Tecnico em Analise e Desenvolvimento de Sistemas";

        // 1° Exercício

        System.out.printf("\nMeu nome é %s, Estou cursando %s e tenho por RA: %d\n",Nome,Curso,RA);

        // 2° Exercício

        System.out.printf("\nTenho %d anos e %f de altura e estive %s na aula de AP1 no dia 25.02.2026\n",Idade, Altura,Status);

        //  3° Exercício - Tabuada

        System.out.println("\nTABUADA DO 5");
        for (int i=1 ; i <=10; i++){System.out.printf("%d * %d = %d%n\n",num,i,num*i);}

        // 4° Exercício

        System.out.println("1° numero:");
        Double x = ler.nextDouble();

        System.out.println("2° numero:");
        Double y = ler.nextDouble();

        System.out.printf("\nO produto destes numeros é %f\n",x*y);

        // 5° Exercício

        System.out.println("1° numero:");
        int N1 = ler.nextInt();

        System.out.println("2° numero:");
        int N2 = ler.nextInt();

        System.out.println("3° numero:");
        int N3 = ler.nextInt();

        System.out.println("4° numero:");
        int N4 = ler.nextInt();

        int soma = N1+N2+N3+N4;
        System.out.printf("\nA soma destes numeros é %d\n",soma);

        //6° Exercício

        System.out.println("1° nota:");
        double V1 = ler.nextDouble();

        System.out.println("2° nota:");
        double V2 = ler.nextDouble();

        System.out.println("3° nota:");
        double V3 = ler.nextDouble();

        double media = (V1+V2+V3)/3;
        System.out.printf("Sua nota é %f",media);

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

        // Exercício 8

        System.out.printf("\nO recultado da expressão 1 é:"+(Math.pow(3,30) == (120-30)));
        System.out.printf("\nO recultado da expressão 2 é:"+(!((20%4/2)==1)||(9 != 9)));
        System.out.printf("\nO recultado da expressão 3 é:"+((5%2)>3));
        System.out.printf("\nO recultado da expressão 3 é:"+("A"=="a"));

        // Exercício 9

        double M = 8.0+7.5+4.5+9.0/4;
        System.out.printf("\nSua media é:"+M);

        //Exercício 10

        System.out.printf("\n Informe o valor do lado do quadrado que deseja calcular:");
        double F = ler.nextDouble();
        double Quadrado = F*F;

        System.out.printf("\n O valor do do quadrado é:"+Quadrado);

        // Exercício 11

        double Raio = 5;
        double Circulo = 3.14*(Raio*Raio);
        System.out.printf("\n A área do círculo é:"+Circulo);

        // Exercício 12

        System.out.println("Ano você de nascimento:");
        int nAno = ler.nextInt();

        System.out.println("Ano atual:");
        int aAtual = ler.nextInt();

        int I = aAtual-nAno;
        int T = 2030-nAno;

        System.out.println("Você tem: "+I);
        System.out.println("Você terá em 2030: "+T);

        //Exercício 13

        System.out.println("Imforme um número: "); 
        double num =e.nextDouble();
        double Q=num*num;
        double cubo=num*num*num;
        double raiz=Math.sqrt(num);
        double potencia=Math.pow(num, 10);
        System.out.println("O quadrado deste numero é: "+quadrado);
        System.out.println("O cubo deste numero é: "+cubo);
        System.out.println("A raiz quadrada deste numero é: "+raiz);
        System.out.println("Este numero elevado a decima potencia é: "+potencia);







    }

