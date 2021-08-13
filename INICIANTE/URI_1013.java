import static java.lang.Math.abs;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);

        int a,c,b;
        int maiorAB,maiorABC;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        maiorAB = (a+b+abs(a-b))/2;
        maiorABC = (c+maiorAB+abs(c-maiorAB))/2;

        System.out.println(maiorABC+" eh o maior");
    }
}