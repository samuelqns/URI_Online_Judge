import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        double V,D,H,A;
        
        while (sc.hasNext()) {
            V = sc.nextDouble();
            D = sc.nextDouble();
            
            H = V/(3.14*Math.pow((D/2), 2));
            A = 3.14*Math.pow(D/2, 2);
            
            System.out.printf("ALTURA = %.2f\n", H);
            System.out.printf("AREA = %.2f\n", A);
        }
    }
}