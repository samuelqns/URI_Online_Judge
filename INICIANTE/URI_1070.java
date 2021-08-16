import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int X,I;
        
        X = sc.nextInt();
        
            if (X%2==0) {
                X = X+1;
            }
            
            for (I=X;I<=(X+10);I+=2) {
                System.out.println(I);
            }
    }
}