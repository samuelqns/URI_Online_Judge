import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,I=1,X;
        
        N = sc.nextInt();
        
            for (I=1;I<=N;++I) {
                
                if (I%2==0) {
                    
                    X = (int) Math.pow(I, 2);
                    
                    System.out.println(I+"^2 = "+X);
                }
            }
    }
}