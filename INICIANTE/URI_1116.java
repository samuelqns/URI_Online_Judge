import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X,Y,I;
        float D;
        
        N = sc.nextInt();
        
            for(I=1;I<=N;++I) {
                X = sc.nextInt();
                Y = sc.nextInt();
                
                if (Y==0) {
                    System.out.println("divisao impossivel");
                }
                else {
                    D = (float) X/Y;
                    System.out.printf("%.1f\n", D);
                }
            }   
    }
}