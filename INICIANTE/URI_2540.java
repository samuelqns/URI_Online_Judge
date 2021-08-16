import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,V,I,T=0;
        double D;
        
        while (sc.hasNext()) {
            N = sc.nextInt();
            D = N*(2.0/3.0);
                
                do {
                    V = sc.nextInt();
                        
                        if (V==1) {
                            T = T+1;
                        }
                        
                    --N;
                } while(N>0);
                    
                if (T>=D) {
                    System.out.println("impeachment");
                }
                else {
                    if (T<D) {
                        System.out.println("acusacao arquivada");
                    }
                }
            T = 0;   
        }
    }
}