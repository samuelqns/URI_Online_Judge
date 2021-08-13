import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        int codigo1,numero1,codigo2,numero2;
        double valor1,valor2,total;

        codigo1 = entrada.nextInt();
        numero1 = entrada.nextInt();
        valor1 = entrada.nextDouble();
        codigo2 = entrada.nextInt();
        numero2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        total = (numero1*valor1)+(numero2*valor2);
        System.out.println ("VALOR A PAGAR: R$ "+formatador.format(total));
    }
}