import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int QT,I;
        int N,M,S;
        String P1,P2,E1,E2;
        
        QT = sc.nextInt();
        
            for (I=1;I<=QT;++I) {
                P1 = sc.next(); E1 = sc.next(); P2 = sc.next(); E2 = sc.next();
                
                N = sc.nextInt(); M = sc.nextInt();
                
                S = N+M;
                
                    if (S%2==0)
                    {// PAR
                        if ("PAR".equals(E1)) {
                            System.out.println(P1);
                        }
                        else {
                            System.out.println(P2);
                        }
                    }
                    else {// IMPAR
                        if ("IMPAR".equals(E1)) {
                            System.out.println(P1);
                        }
                        else {
                            System.out.println(P2);
                        }
                    }
            }
    }
}