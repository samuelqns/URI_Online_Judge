import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double N1,N2,M;
        int X=1;
        
            while (X==1) {
                N1 = sc.nextDouble();
                
                    while (N1<0 || N1>10) {
                        System.out.println("nota invalida");
                        N1 = sc.nextDouble();
                    }
                    
                N2 = sc.nextInt();
                
                    while (N2<0 || N2>10) {
                        System.out.println("nota invalida");
                        N2 = sc.nextDouble();
                    }
                    
                M = (N1+N2)/2;
                
                System.out.printf("media = %.2f\n", M);
                
                System.out.println("novo calculo (1-sim 2-nao)");
                
                X = sc.nextInt();
                
                    while (X<1 || X>2) {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        X = sc.nextInt();
                    }
            }
    }
}