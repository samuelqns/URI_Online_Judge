import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,Pos,MaiorN,I;
        
        N = sc.nextInt();
        MaiorN = N;
        Pos = 1;
        
            for (I=2;I<=100;++I) {
                N = sc.nextInt();
                
                if (N>MaiorN) {
                    MaiorN = N;
                    Pos = I;
                }
            }
            
            System.out.println(MaiorN);
            System.out.println(Pos);
    }
}