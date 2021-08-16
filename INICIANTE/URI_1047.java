import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,Im,F,Fm,H,M;
        
        I = sc.nextInt();
        Im = sc.nextInt();
        F = sc.nextInt();
        Fm = sc.nextInt();
        
        I = I*60+Im;
        F = F*60+Fm;
        
            if (I==F) {
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            else if (I>F) {
                H = (1440-I+F)/60;
                M = (1440-I+F)%60;
                System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
            }
            else if (F>I) {
                H = (F-I)/60;
                M = (F-I)%60;
                System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
            }
    }
}