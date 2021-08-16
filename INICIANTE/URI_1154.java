import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N=1,I,C=0;
        double M=0;
        
            for (I=1;N>0;++I) {
                N = sc.nextInt();
                
                if (N>0) {
                    M += N;
                    C = I;
                }
            }
            M = M/C;
            
            System.out.printf("%.2f\n", M);
    }
}
