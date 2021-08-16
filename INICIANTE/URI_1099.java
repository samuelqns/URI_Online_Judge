import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X,Y,I,J,S=0,A;
        
        N = sc.nextInt();
        
            for (J=1;J<=N;++J) {
                X = sc.nextInt(); Y = sc.nextInt();

                    if (Y<X) {// se Y for o menor numero.
                        A = X;
                        X = Y;
                        Y = A;
                    }

                    for (I=(X+1);I<Y;++I) {
                        if (I%2!=0) {
                            S += I;
                        }
                    }
                System.out.println(S);
                S = 0;
            }
    }
}