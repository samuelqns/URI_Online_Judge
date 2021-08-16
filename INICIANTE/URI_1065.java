import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,I,P=0;
        
            for (I=1;I<=5;++I) {
                N = sc.nextInt();
                
                    if (N%2==0) {
                        ++P;
                    }
            }
        System.out.println(P+" valores pares");
    }
}