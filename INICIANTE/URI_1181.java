import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,J,L;
        double A[][],S,M;
        char C;
        
        L = sc.nextInt();
        C = sc.next().charAt(0);
        A = new double[12][12];
        S = 0;
        
            for (I=0;I<12;I++) {
                for (J=0;J<12;J++) {
                    A[I][J] = sc.nextDouble();
                    
                        if (I==L) {
                            S += A[I][J];
                        }
                }
            }
            
            if (C=='S') {
                System.out.printf("%.1f\n", S);
            }
            else {
                if (C=='M') {
                    M = S/12;
                    System.out.printf("%.1f\n", M);
                }
            }
    }
}