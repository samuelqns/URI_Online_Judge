import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.0000");

        double x1,x2,y1,y2,distancia;
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();

        distancia = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println (formatador.format(distancia));
    }
}