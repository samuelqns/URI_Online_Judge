import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N[],I,AX;
        
        N = new int[20];
        
            for (I=0;I<20;I++) {
                N[I] = sc.nextInt();
            }
            
            for (I=0;I<10;I++) {
                AX = N[I];
                N[I] = N[19-I];
                N[19-I] = AX;
            }
            
            for (I=0;I<20;I++) {
                System.out.println("N["+I+"] = "+N[I]);
            }
            
    }
}