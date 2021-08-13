import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        DecimalFormat form = new DecimalFormat ("0.00000");
        
        double A,B,C,Delta,R1,R2;
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        
        Delta = B*B-4*A*C;
        
            if (A==0){
                System.out.println("Impossivel calcular");
            } else if (Delta>0){ //Duas raizes
                R1 = (-B+Math.sqrt(Delta))/(2*A);
                R2 = (-B-Math.sqrt(Delta))/(2*A);
                
                System.out.println("R1 = " + form.format(R1));
                System.out.println("R2 = " + form.format(R2));
            } else if (Delta==0){ //Uma raiz
                R1 = -B/(2*A);
                    
                System.out.println("R1 = " + form.format(R1));
            } else if (Delta<0){
                System.out.println("Impossivel calcular");
            }
    }
}