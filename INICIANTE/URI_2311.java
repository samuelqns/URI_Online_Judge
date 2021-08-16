import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T,I,J;
        String nome;
        double GD,N,NT,Nmx,Nmi;
        
        T = sc.nextInt();
        
            for (I=1;I<=T;I++) {
                nome = sc.next();
                GD = sc.nextDouble();
                
                N = sc.nextDouble();
                Nmx = N; Nmi = N; NT = N;
                
                    for (J=1;J<=6;J++) {
                        N = sc.nextDouble();
                        NT += N;
                        
                            if (N>Nmx) {
                                Nmx = N;
                            }
                            else {
                                if (N<Nmi) {
                                    Nmi = N;
                                }
                            }
                    }
                    
                N = (NT-Nmx-Nmi)*GD;
                
                System.out.print(nome+" ");
                System.out.printf("%.2f\n", N);
            }
    }
}