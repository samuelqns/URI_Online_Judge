import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");

        int distancia;
        double combustivel,consumo;

        distancia = entrada.nextInt();
        combustivel = entrada.nextDouble();

        consumo = distancia/combustivel;
        System.out.println (formatador.format(consumo) +" km/l");
    }
}