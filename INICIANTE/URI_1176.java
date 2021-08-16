import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T,I,N;
        long F[];
        
        F = new long[61];
        F[0] = 0;
        F[1] = 1;
        
            for (I=2;I<61;I++) {
                F[I] = F[I-1]+F[I-2];
            }
            
        T = sc.nextInt();
        
            for (I=1;I<=T;I++) {
                N = sc.nextInt();
                System.out.println("Fib("+N+") = "+F[N]);
            }
    }
}