import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int S;
        
        S = sc.nextInt();
        
            while (S!=2002) {
                System.out.println("Senha Invalida");
                
                S = sc.nextInt();
            }
            
        System.out.println("Acesso Permitido");
    }
}