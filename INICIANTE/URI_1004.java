import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
    
        int a,b,prod;
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        prod = a*b;
        System.out.println("PROD = " +prod);
    }
}