import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,A,Amin,Amax,C=0,I;
        
            while(sc.hasNext()) {
                N = sc.nextInt(); Amin = sc.nextInt(); Amax = sc.nextInt();
        
                    for (I=1;I<=N;++I) {
                        A = sc.nextInt();
                
                            if (A>=Amin && A<=Amax) {
                                ++C;
                            }
                    }
            
                System.out.println(C);
                C = 0;
            }
    }
}