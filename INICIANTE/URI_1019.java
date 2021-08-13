import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
        int tempo,hora,minuto,minuto_resto,segundo,segundo_resto;
        
        tempo = entrada.nextInt();
        
        segundo = tempo%60;
        segundo_resto = tempo/60;
        minuto = segundo_resto%60;
        minuto_resto = segundo_resto/60;
        hora = minuto_resto;
        
        System.out.println(hora+":"+minuto+":"+segundo);
    }
}