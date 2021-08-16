import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int X,Y,I;
        
        X = sc.nextInt();
        Y = sc.nextInt();
        
            if (Y>X) {
                for(I=X+1;I<Y;++I) {
                    if (I%5==2 || I%5==3) {
                        System.out.println(I);
                    }
                }
            }
            else {
                if (X>Y) {
                    for (I=Y+1;I<X;++I) {
                        if (I%5==2 || I%5==3) {
                            System.out.println(I);
                        }
                    }
                }
            }
    }
}