import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String DT;
        int P1=0,P2=0,P=0;
        int A1=0,A2=0,A3=0,A=0;
        int N1=0,N2=0,N3=0,N=0;
        
        DT = sc.nextLine();
        
            while (P1<2) {// caso 1 MM;
                    if (P==0) {
                        P = 3;
                    }
                System.out.print(DT.charAt(P));
                ++P;    
                ++P1;
            } 
        System.out.print("/");
        P = 0;
            while (P2<4) {// caso 1 DD e AA
                    if (P==2) {
                        System.out.print("/");
                        P = 6;
                    }
                System.out.print(DT.charAt(P));
                ++P;
                ++P2;
            }
            
        System.out.println("");
            
            while (A1<2) {// caso 2 AA
                    if (A==0) {
                        A = 6;
                    }
                System.out.print(DT.charAt(A));
                ++A;
                ++A1;
            }
        System.out.print("/");
        A = 0;
            while (A2<2) {// caso 2 MM
                    if (A==0) {
                        A = 3;
                    }
                System.out.print(DT.charAt(A));
                ++A;
                ++A2;
            }
        System.out.print("/");
        A = 0;
            while (A3<2) {// caso 2 DD
                System.out.print(DT.charAt(A));
                ++A;
                ++A3;
            }
            
        System.out.println("");
        
            while (N1<2) {// caso 3 DD    
                System.out.print(DT.charAt(N));
                ++N;
                ++N1;
            }
        System.out.print("-");
        N = 0;
            while (N2<2) {// caso 3 MM
                    if (N==0) {
                        N = 3;
                    }
                System.out.print(DT.charAt(N));
                ++N;
                ++N2;
            }
        System.out.print("-");
        N = 0;
            while (N3<2) {// caso 3 AA
                    if (N==0) {
                        N = 6;
                    }
                System.out.print(DT.charAt(N));
                ++N;
                ++N3;
            }
        System.out.println("");
    }
}