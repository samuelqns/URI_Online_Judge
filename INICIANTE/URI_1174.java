import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double A[];
        int I;
        
        A = new double[100];
        
            for (I=0;I<100;I++) {
                A[I] = sc.nextDouble();
            }
            
            for (I=0;I<100;I++) {
                if (A[I]<=10) {
                    System.out.printf("A["+I+"] = %.1f\n", A[I]);
                }
            }
    }
}