import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        double A,B,C;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
            if (A>Math.abs(B-C) && A<(B+C)){
                System.out.println("Perimetro = "+ (A+B+C));
            }
            else {
                System.out.println("Area = "+ ((A+B)*C)/2);
            }
    }
}