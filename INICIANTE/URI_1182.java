import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,J,C;
        double A[][],S,M;
        char T;
        
        C = sc.nextInt();
        T = sc.next().charAt(0);
        A = new double[12][12];
        S = 0;
        
            for (I=0;I<12;I++) {
                for (J=0;J<12;J++) {
                    A[I][J] = sc.nextDouble();
                    
                        if (C==J) {
                            S += A[I][J];
                        }
                }
            }
            
            if (T=='S') {
                System.out.printf("%.1f\n", S);
            }
            else {
                if (T=='M') {
                    M = S/12;
                    System.out.printf("%.1f\n", M);
                }
            }
    }
}