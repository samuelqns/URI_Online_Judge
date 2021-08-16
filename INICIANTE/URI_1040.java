import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        DecimalFormat form = new DecimalFormat("0.0");
        
        float N1,N2,N3,N4,M,E,F;
        
        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        
        M = (float) (N1*0.2+N2*0.3+N3*0.4+N4*0.1);
        
            if (M>=7.0) {
                System.out.println("Media: "+ M);
                System.out.println("Aluno aprovado.");
            } else if (M<5){
                System.out.println("Media: "+ form.format(M));
                System.out.println("Aluno reprovado.");
            } else if (M>=5.0 || M<=6.9){
                E = sc.nextFloat();
                
                F = (M+E)/2;
                
                    if (F>=5.0) {
                        System.out.println("Media: "+ M);
                        System.out.println("Aluno em exame.");
                        System.out.println("Nota do exame: "+ E);
                        System.out.println("Aluno aprovado.");
                        System.out.println("Media final: "+ F);
                    } else if (F<=4.9) {
                        System.out.println("Media: "+ M);
                        System.out.println("Aluno em exame.");
                        System.out.println("Nota do exame: "+ E);
                        System.out.println("Aluno reprovado.");
                        System.out.printf("Media final: "+ F);
                    }
            }
    }
}