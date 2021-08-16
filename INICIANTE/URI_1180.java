import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,X[],I,MV,P=0;
        
        N = sc.nextInt();
        X = new int[N];
        X[0] = sc.nextInt();
        MV = X[0];
        
            for (I=1;I<N;I++) {
                X[I] = sc.nextInt();
                
                    if (X[I]<MV) {
                        MV = X[I];
                        P = I;
                    }
            }
        System.out.println("Menor valor: "+MV);
        System.out.println("Posicao: "+P);
    }
}