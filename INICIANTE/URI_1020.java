import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        int idade_dias,ano,ano_resto,mes,mes_resto,dia;

        idade_dias = entrada.nextInt();

        ano = idade_dias/365;
        ano_resto = idade_dias%365;
        mes = ano_resto/30;
        mes_resto = ano_resto%30;
        dia = mes_resto;

        System.out.println(ano + " ano(s)" + "\n" + mes + " mes(es)" + "\n" + dia + " dia(s)");
    }
}