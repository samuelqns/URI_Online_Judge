import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T,I,S,S1,ST=0,ST1=0,B,B1,BT=0,BT1=0,A,A1,AT=0,AT1=0;
        double PS,PB,PA;
        String NM;
        
        T = sc.nextInt();
        
            for (I=1;I<=T;I++) {
                NM = sc.next();
                S = sc.nextInt(); B = sc.nextInt(); A = sc.nextInt();
                S1 = sc.nextInt(); B1 = sc.nextInt(); A1 = sc.nextInt();
                ST += S; BT += B; AT += A;
                ST1 += S1; BT1 += B1; AT1 += A1;
            }
            
        PS = ST1*100.0/ST;
        PB = BT1*100.0/BT;
        PA = AT1*100.0/AT;
        
        System.out.printf("Pontos de Saque: %.2f", PS); System.out.println(" %.");
        System.out.printf("Pontos de Bloqueio: %.2f", PB); System.out.println(" %.");
        System.out.printf("Pontos de Ataque: %.2f", PA); System.out.println(" %.");
    }
}