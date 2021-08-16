import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,T,I,A;
        
        N = sc.nextInt();
        
            for (I=1;I<=N;++I) {
                T = sc.nextInt();
                
                A = 2015-T;
                
                    if (A>0) {// Depois de Cristo
                        System.out.println(A+" D.C.");
                    }
                    else {
                        A = Math.abs(A);
                        System.out.println((A+1)+" A.C.");
                    }
            }
    }
}