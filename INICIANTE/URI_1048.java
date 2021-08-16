import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        double S,R,N;
        
        S = sc.nextDouble();
        
            if (S<=400.00) { //reajuste de 15%
                R = S*0.15;
                N = S+R;
                System.out.printf("Novo salario: %.2f%n", N);
                System.out.printf("Reajuste ganho: %.2f%n", R);
                System.out.println("Em percentual: 15 %");
            }
            else if (S>=400.01 && S<=800.00) { //reajuste de 12%
                R = S*0.12;
                N = S+R;
                System.out.printf("Novo salario: %.2f%n", N);
                System.out.printf("Reajuste ganho: %.2f%n", R);
                System.out.println("Em percentual: 12 %");
            }
            else if (S>=800.01 && S<=1200.00) { // reajuste de 10%
                R = S*0.10;
                N = S+R;
                System.out.printf("Novo salario: %.2f%n", N);
                System.out.printf("Reajuste ganho: %.2f%n", R);
                System.out.println("Em percentual: 10 %");
            }
            else if (S>=1200.01 && S<=2000.00) { // reajuste de 7%
                R = S*0.07;
                N = S+R;
                System.out.printf("Novo salario: %.2f%n", N);
                System.out.printf("Reajuste ganho: %.2f%n", R);
                System.out.println("Em percentual: 7 %");
            }
            else {
                R = S*0.04;
                N = S+R;
                System.out.printf("Novo salario: %.2f%n", N);
                System.out.printf("Reajuste ganho: %.2f%n", R);
                System.out.println("Em percentual: 4 %");
            }
    }
}