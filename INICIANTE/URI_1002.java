import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.0000");
    
        double n,raio,area;
        n = 3.14159;
        raio = entrada.nextDouble();
        
        area = n*raio*raio;
        
        System.out.println("A=" +formatador.format(area));
    }
}