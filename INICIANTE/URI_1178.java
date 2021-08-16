import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double N[],Y;
        int I;
        
        N = new double[100];
        Y = sc.nextDouble();
        
            for (I=0;I<100;I++) {
                N[I] = Y;
                System.out.printf("N["+I+"] = %.4f\n", N[I]);
                Y = Y/2;
            }
    }
}