import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int L,C,I,P,S;
        
        L = sc.nextInt();
        C = sc.nextInt();
        
        P = (L*C)+((L-1)*(C-1));
        S = (L-1)*2+(C-1)*2;
            
        System.out.println(P);// PRIMEIRO TIPO
        System.out.println(S);// SEGUNDO TIPO
    }
}