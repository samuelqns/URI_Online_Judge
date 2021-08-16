import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int X,Y,I,S=0,A;
        
        X = sc.nextInt();
        Y = sc.nextInt();
        
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
    }
}