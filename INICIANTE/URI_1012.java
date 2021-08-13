import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        DecimalFormat formatador = new DecimalFormat("0.000");

        double a,c,b,pi;
        double triangulo,circulo,trapezio,quadrado,retangulo;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        pi = 3.14159;

        triangulo = (a*c)/2;
        circulo = pi*(c*c);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;

        System.out.println ("TRIANGULO: "+formatador.format(triangulo)+"\n"
                            +"CIRCULO: "+formatador.format(circulo)+"\n"
                            +"TRAPEZIO: "+formatador.format(trapezio)+"\n"
                            +"QUADRADO: "+formatador.format(quadrado)+"\n"
                            +"RETANGULO: "+formatador.format(retangulo));
    }
}