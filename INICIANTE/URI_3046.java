import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,P;
        
        N = sc.nextInt();
        
        P = ((N+1)*(N+2))/2;
        
        System.out.println(P);
    }
}