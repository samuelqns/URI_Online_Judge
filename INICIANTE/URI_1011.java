import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");

        double r,pi,volume;

        r = entrada.nextDouble();
        pi = 3.14159;

        volume = (4/3.0)*pi*(r*r*r);
        System.out.println ("VOLUME = "+formatador.format(volume));
    }
}