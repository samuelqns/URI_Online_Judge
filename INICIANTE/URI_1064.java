import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        float N,S,M;
        int I,C=0;
        
            for (I=0,S=0;I<6;++I) {
                
                N = sc.nextFloat();
                
                    if (N>0) {
                        
                        S+=N;
                        C+=1;
                    }
            }
        
        M = S/C;
            
        System.out.println(C+" valores positivos");
        System.out.printf("%.1f\n", M);
    }
}