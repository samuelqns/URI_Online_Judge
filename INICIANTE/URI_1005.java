import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.00000");

        double nota1,nota2,media;
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        media = ((nota1*3.5)+(nota2*7.5))/11;
        System.out.println("MEDIA = " + formatador.format(media));
    }
}