import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X,I=0,in=0,out=0;
        
        X = sc.nextInt();
        
            for (I=0;I<X;++I) {
                
                N = sc.nextInt();
                
                    if (N>=10 && N<=20) {
                        in+=1;
                    }
                    else {
                        out+=1;
                    }
            }
            
            System.out.println(in+" in");
            System.out.println(out+" out");
    }
}