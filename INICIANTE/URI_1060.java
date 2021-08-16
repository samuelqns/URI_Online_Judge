import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int I,C=0;
        double N;
        
            for (I=1;I<=6;++I) {
                N = sc.nextDouble();
                
                    if (N>0) {
                        ++C;
                    }
            }
            
        System.out.println(C+" valores positivos");
    }
}