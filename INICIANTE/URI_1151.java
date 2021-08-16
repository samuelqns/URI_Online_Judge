import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,I,F1=1,F2=1,FN;
        
        N = sc.nextInt();
        
            if (N>=3) {
                System.out.printf("0 %d %d", F1,F2);
            }
            else {
                if (N==2) {
                    System.out.printf("0 %d", F1);
                }
                else {
                    if (N==1) {
                        System.out.print("0");
                    }
                }
            }
        
            for (I=3;I<N;++I) {
                FN = F1 + F2;
                
                System.out.printf(" %d", FN);
                
                F1 = F2;
                F2 = FN;
            }
        System.out.println("");
    }
}