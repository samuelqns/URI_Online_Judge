import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,I,L[],J;
        String A;
        char M;
        
            while (sc.hasNext()) {
                A = sc.next();
                N = sc.nextInt();
                L = new int[N];
                
                    for (I=0;I<N;I++) {
                        L[I] = sc.nextInt();
                    }
                    
                    for (J=0;J<N;J++) {
                        M = A.charAt(L[J]-1);
                        System.out.print(M);
                    }
                System.out.println("");
            }
    }
}