import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int X,I=0;
        
        X =  sc.nextInt();
        
            if (X%2==0) { 
                for (I=1;I<X;++I) {
                    if (I%2!=0) {
                        System.out.println(I);
                    }
                }
            }
            else {
                for (I=1;I<=X;++I) {
                    if (I%2!=0) {
                        System.out.println(I);
                    }
                }
            }
    }
}