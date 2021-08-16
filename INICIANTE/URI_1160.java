import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,T,PA,PB,ANO;
        double G1,G2;
        
        T = sc.nextInt();
        
            for (I=0;I<T;++I) {
                PA = sc.nextInt(); PB = sc.nextInt(); G1 = sc.nextDouble(); G2 = sc.nextDouble();
                
                ANO = 0;
                
                    while (PA<=PB && ANO<=100) {
                        PA = (int) (PA + PA*(G1/100));
                        PB = (int) (PB + PB*(G2/100));
                        ++ANO;
                    }
                    
                    if (ANO>100) {
                        System.out.println("Mais de 1 seculo.");
                    }
                    else {
                        System.out.println(ANO+" anos.");
                    }
            }
    }
}