import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        double N=0,M=0;
        int C=0;
        
            do {
                N = sc.nextDouble();
                
                    if (N>=0 && N<=10) {
                        M += N;
                        ++C;
                    }
                    else {
                        System.out.println("nota invalida");
                    }
                    
            } while(C<2);
            
            M = M/C;
            System.out.printf("media = %.2f\n", M);
    }
}
