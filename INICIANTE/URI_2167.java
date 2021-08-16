import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,R[],I,P;
        
        N = sc.nextInt();
        R = new int[N];
        
            for (I=0;I<N;I++) {
                R[I] = sc.nextInt();
            }
            
        P = 0;
        
            for (I=1;I<N && R[I]>=R[I-1];I++);
            if (I<N) {
                P = I+1;
            }
            
        System.out.println(P);
    }
}