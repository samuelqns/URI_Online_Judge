import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X=0,I=0;
        
        N = sc.nextInt();
        
            for (I=0;I<10000;++I) {
                
                if (I%N==2) {
                    System.out.println(I);
                }
            }
    }
}