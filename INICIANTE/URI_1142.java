import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,C=0,I=1;
        
        N = sc.nextInt();
        
            while (C<N) {
                System.out.println(I+" "+(I+1)+" "+(I+2)+" PUM");
                ++C;
                I += 4;
            }
    }
}