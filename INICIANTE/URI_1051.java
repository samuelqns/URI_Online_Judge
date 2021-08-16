import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        double S;
        
        S = sc.nextDouble();
        
            if (S<=2000.00) { //Insento
                System.out.println("Isento");
            }
            else if (S>=2000.01 && S<=3000.00) { //imposto de renda 8%
                S = (S-2000)*0.08;
                System.out.printf("R$ %.2f%n", S);
            }
            else if (S>=3000.01 && S<=4500.00) { //imposto de renda 18%
                S = 1000*0.08+(S-3000)*0.18;
                System.out.printf("R$ %.2f%n", S);
            }
            else { //acima de 4500.00 imposto de renda 28%
                S = 1000*0.08+1500*0.18+(S-4500)*0.28;
                System.out.printf("R$ %.2f%n", S);
            }
    }
}