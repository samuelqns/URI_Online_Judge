import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int M,N,A,I,S=0;
        
        M = sc.nextInt(); N = sc.nextInt();
        
            while (M>0 && N>0) {
                    if (N>M) {
                        A = M;
                        M = N;
                        N = A;
                    }

                    for (I=N;I<=M;++I) {
                        System.out.print(I+" ");
                        S += I;
                    }
                    
                System.out.println("Sum="+S);
                S = 0;
                
                M = sc.nextInt(); N = sc.nextInt();
            }
    }
}