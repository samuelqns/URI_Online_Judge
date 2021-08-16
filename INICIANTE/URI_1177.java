import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T,L,I,N[];
        
        T = sc.nextInt();
        L = 0;
        N = new int[1000];
        
            for (I=0;I<1000;I++) {
                N[I] = L;
                L++;
                
            System.out.println("N["+I+"] = "+N[I]);
                
                if (L==T) {
                    L = 0;
                }
            }
    }
}