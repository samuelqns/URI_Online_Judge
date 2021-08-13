import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");

        double litros;
        int tempo,velocidade,distancia;
        tempo = entrada.nextInt();
        velocidade = entrada.nextInt();

        distancia = velocidade*tempo;
        litros = distancia*(1.0/12);

        System.out.println (formatador.format(litros));
    }
}