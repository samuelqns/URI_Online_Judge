import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,I;
        double A,B,C,M;
        
        N = sc.nextInt();
        
            for (I=1;I<=N;++I) {
                A = sc.nextDouble(); B = sc.nextDouble(); C = sc.nextDouble();
                
                M = (A*0.2+B*0.3+C*0.5);
                
                System.out.printf("%.1f\n", M);
            }
    }
}