import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        String nome;
        double salario,vendas,bonus,total;

        nome = entrada.next();
        salario = entrada.nextDouble();
        vendas = entrada.nextDouble();

        bonus = (vendas*0.15);
        total = (salario+bonus);
        System.out.println("TOTAL = R$ " +formatador.format(total));
    }
}