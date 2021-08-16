import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,I;
        double F;
        
        N = sc.nextInt();
        
        F = 0.0;
        
            for (I=1;I<=N;++I) {
                F = 1/(6+F);
            }
            
        F = F+3;
            
        System.out.printf("%.10f\n", F);
    }
}