import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.0");

        double nota1,nota2,nota3,media;
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
        System.out.println("MEDIA = " + formatador.format(media));
    }
}