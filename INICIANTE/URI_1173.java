import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int V,N[],I,M;
        
        V = sc.nextInt();
        N = new int[10];
        M = V;
        
            for (I=0;I<10;I++) {
                N[I] = M;
                System.out.println("N["+I+"] = "+N[I]);
                M *= 2;
            }
    }
}