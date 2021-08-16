import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X=0,I=1;
        
        N = sc.nextInt();
        
            for (I=1;I<=10;++I) {
                
                if (N>2 && N<1000) {
                    X = I*N;
                    System.out.println(I+" x "+N+" = "+X);
                }
            }
    }
}