import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int P,N,Q1,Q2,I,S,C=0;
        
        P = sc.nextInt(); N = sc.nextInt();
        
        Q1 = sc.nextInt();
        
            for (I=1;I<N;++I) {
                Q2 = sc.nextInt();
                
                    if (Math.abs(Q1-Q2)<=P) {
                       Q1 = Q2;
                       ++C;
                    }
                    else {
                        System.out.println("GAME OVER");
                        I += 10;
                    }
            }
            
            if (C==(N-1)) {
                System.out.println("YOU WIN");
            }
    }
}