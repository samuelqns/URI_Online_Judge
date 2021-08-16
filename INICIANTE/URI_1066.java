import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int I,X,P=0,N=0,Par=0,Imp=0;
        
            for (I=0;I<5;++I) {
                
                X = sc.nextInt();
                
                    if (X>0) {//positivo
                        P+=1;
                    }
                    else if (X<0) {//negativo
                        N+=1;
                    }
                    if (X%2==0) {//par
                        Par+=1;
                    }
                    else {//impar
                        Imp+=1;
                    }
            }
            
        System.out.println(Par+" valor(es) par(es)");
        System.out.println(Imp+" valor(es) impar(es)");
        System.out.println(P+" valor(es) positivo(s)");
        System.out.println(N+" valor(es) negativo(s)");
        
    }
}