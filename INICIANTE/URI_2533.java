import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int M,I,N,C,S1,S2;
        double IRA;
        
            while (sc.hasNext()) {
                M = sc.nextInt();
                S1 = 0; S2 = 0;
                
                    for (I=1;I<=M;I++) {
                        N = sc.nextInt(); C = sc.nextInt();
                        
                        S1 += N*C;
                        S2 += C;
                    }
                IRA = S1/(S2*100.0);
                
                System.out.printf("%.4f\n", IRA);
            }
    }
}