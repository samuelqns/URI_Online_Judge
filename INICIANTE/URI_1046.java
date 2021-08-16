import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int I,F,H;
        
        I = sc.nextInt();
        F = sc.nextInt();
        
            if (I==F) {
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
            else if (I>F) {
                H = 24-I+F;
                System.out.println("O JOGO DUROU "+H+" HORA(S)");
            }
            else if (F>I) {
                H = F-I;
                System.out.println("O JOGO DUROU "+H+" HORA(S)");
            }
    }
}