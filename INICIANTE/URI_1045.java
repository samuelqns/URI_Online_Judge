import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        float A,B,C,T;
        
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        
            if (B>A) {
                T = A;
                A = B;
                B = T;
            }
            if (C>A) {
                T = A;
                A = C;
                C = T;
            }
            if(A>=B+C) {
                 System.out.println("NAO FORMA TRIANGULO");
            }
            else {//forma triangulo
                if (A*A==B*B+C*C){
                    System.out.println("TRIANGULO RETANGULO");
                }
                if (A*A>B*B+C*C){
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                else if (A*A<B*B+C*C){
                    System.out.println("TRIANGULO ACUTANGULO");
                }
                if (A==B && B==C){
                    System.out.println("TRIANGULO EQUILATERO");
                }
                else if (A==B || B==C || A==C){
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
    }
}