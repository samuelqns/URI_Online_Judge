import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");

        int numero,horas;
        double porhora,salario;

        numero = entrada.nextInt();
        horas = entrada.nextInt();
        porhora = entrada.nextDouble();

        salario = (horas*porhora);
        System.out.println("NUMBER = "+numero+"\n"+"SALARY = U$ "+formatador.format(salario));
    }
}