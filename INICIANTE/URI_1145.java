import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int X,Y,I,J;
        
        X = sc.nextInt();
        Y = sc.nextInt();
        
            for (I=1;I<Y;++I) {
                for (J=0;J<X;++J) {
                    if (J+1==X) {
                        System.out.print(I+J);
                    }
                    else {
                        System.out.print(I+J + " ");
                    }
                }
                
                System.out.println("");
                I = I+(X-1);
            }
    }
}