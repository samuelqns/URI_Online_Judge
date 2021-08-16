import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,F,N;
        
        N = sc.nextInt();
        F = N;
        
            for (I=(N-1);I>=1;--I) {
                F *= I;
            }
            System.out.println(F);
    }
}