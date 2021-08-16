import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        DecimalFormat form = new DecimalFormat ("0.00");
        
        int c,q;
        double t;
        
        c = sc.nextInt();
        q = sc.nextInt();
        
            if (c==1) {
                t = q*4;
                System.out.println("Total: R$ " + form.format(t));
            } else if (c==2) {
                t = q*4.50;
                System.out.println("Total: R$ " + form.format(t));
            } else if (c==3) {
                t = q*5;
                System.out.println("Total: R$ " + form.format(t));
            } else if (c==4) {
                t = q*2;
                System.out.println("Total: R$ " + form.format(t));
            } else if (c==5) {
                t = q*1.50;
                System.out.println("Total: R$ " + form.format(t));
            }
    }
}