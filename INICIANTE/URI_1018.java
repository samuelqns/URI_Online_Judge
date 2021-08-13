import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        int valor,nota100,resto100,nota50,resto50,nota20,resto20,nota10,resto10,nota5,resto5,nota2,resto2,nota1;
        valor = entrada.nextInt();

        nota100 = valor/100;
        resto100 = valor%100;
        nota50 = resto100/50;
        resto50 = resto100%50;
        nota20 = resto50/20;
        resto20 = resto50%20;
        nota10 = resto20/10;
        resto10 = resto20%10;
        nota5 = resto10/5;
        resto5 = resto10%5;
        nota2 = resto5/2;
        resto2 = resto5%2;
        nota1 = resto2/1;

        System.out.println(valor + "\n" + nota100 + " nota(s) de R$ 100,00" + "\n" 
                                        + nota50 + " nota(s) de R$ 50,00" + "\n" 
                                        + nota20 + " nota(s) de R$ 20,00" + "\n" 
                                        + nota10 + " nota(s) de R$ 10,00" + "\n" 
                                        + nota5 + " nota(s) de R$ 5,00" + "\n" 
                                        + nota2 + " nota(s) de R$ 2,00" + "\n" 
                                        + nota1 + " nota(s) de R$ 1,00");
}
}