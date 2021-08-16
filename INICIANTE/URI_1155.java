import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        double S=0,I;
        
            for (I=1;I<=100;++I) {
                S += 1/I; 
            }
            
            System.out.printf("%.2f\n", S);
    }
}