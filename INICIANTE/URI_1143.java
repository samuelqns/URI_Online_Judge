import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,I,Q,C;
        
        N = sc.nextInt();
        
            for (I=1;I<=N;++I) {
                Q = (int) Math.pow(I, 2);
                C = (int) Math.pow(I, 3);
                
                System.out.println(I+" "+Q+" "+C);
            }
    }
}