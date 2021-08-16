import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int N,X,I;
        
        N = sc.nextInt();
        
            for(I=0;I<N;++I) {
                X = sc.nextInt();
                
                    if (X==0) {
                        System.out.println("NULL");
                    }
                    else {
                        if (X%2==0) {//par
                            if (X>0) {//positivo
                                System.out.println("EVEN POSITIVE");
                            }
                            else {//negativo
                                System.out.println("EVEN NEGATIVE");
                            }
                        }
                        else {//impar
                            if (X>0) {//positivo
                                System.out.println("ODD POSITIVE");
                            }
                            else {//negativo
                                System.out.println("ODD NEGATIVE");
                            }
                        }
                    }
            }
    }
}