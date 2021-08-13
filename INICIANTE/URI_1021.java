import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    Scanner entrada = new Scanner (System.in);

    double valor;
    int nota100,nota50,nota20,nota10,nota5,nota2;
    int moeda1,moeda0_50,moeda0_25,moeda0_10,moeda0_05,moeda0_01;
    
    valor = entrada.nextDouble();

    //NOTAS
        nota100 = (int) (valor*100)/10000;
        nota50 = (int) (valor*100)%10000/5000;
        nota20 = (int) (valor*100)%10000%5000/2000;
        nota10 = (int) (valor*100)%10000%5000%2000/1000;
        nota5 = (int) (valor*100)%10000%5000%2000%1000/500;
        nota2 = (int) (valor*100)%10000%5000%2000%1000%500/200;
    //MOEDAS
        moeda1 = (int) (valor*100)%10000%5000%2000%1000%500%200/100;
        moeda0_50 = (int) (valor*100)%10000%5000%2000%1000%500%200%100/50;
        moeda0_25 = (int) (valor*100)%10000%5000%2000%1000%500%200%100%50/25;
        moeda0_10 = (int) (valor*100)%10000%5000%2000%1000%500%200%100%50%25/10;
        moeda0_05 = (int) (valor*100)%10000%5000%2000%1000%500%200%100%50%25%10/5;
        moeda0_01 = (int) (valor*100)%10000%5000%2000%1000%500%200%100%50%25%10%5;

    System.out.println("NOTAS:");
    System.out.println(nota100 + " nota(s) de R$ 100.00");
    System.out.println(nota50 + " nota(s) de R$ 50.00");
    System.out.println(nota20 + " nota(s) de R$ 20.00");
    System.out.println(nota10 + " nota(s) de R$ 10.00");
    System.out.println(nota5 + " nota(s) de R$ 5.00");
    System.out.println(nota2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(moeda1 + " moeda(s) de R$ 1.00");
    System.out.println(moeda0_50 + " moeda(s) de R$ 0.50");
    System.out.println(moeda0_25 + " moeda(s) de R$ 0.25");
    System.out.println(moeda0_10 + " moeda(s) de R$ 0.10");
    System.out.println(moeda0_05 + " moeda(s) de R$ 0.05");
    System.out.println(moeda0_01 + " moeda(s) de R$ 0.01");
    }
}