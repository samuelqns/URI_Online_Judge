import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int A,B,C,X;
        
        A = sc.nextInt();
        
            while (A>0) {
                B = sc.nextInt();
                C = sc.nextInt();
                
                X = (int) Math.sqrt((A*B*100)/C);
                System.out.println(X);
                
                A = sc.nextInt();
            }
    }
}