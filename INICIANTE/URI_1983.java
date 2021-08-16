import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int C,I,M,Mx=0;
        float N,Nx=0,Nc=8;
        
        C = sc.nextInt();
        
            for (I=1;I<=C;I++) {
                M = sc.nextInt(); N = sc.nextFloat();
                
                    if (N>=Nc) {
                        Nc = N;
                        Nx = N;
                        Mx = M;
                    }
            }
            
            if (Nx>=8) {
                System.out.println(Mx);
            }
            else {
                System.out.println("Minimum note not reached");
            }
    }
}