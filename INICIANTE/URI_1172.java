import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int X[],I;
        
        X = new int[10];
        
            for (I=0;I<10;I++) {
                X[I] = sc.nextInt();
                
                    if (X[I]<1) {
                        X[I] = 1;
                    }
            }
            
            for (I=0;I<10;I++) {
                System.out.println("X["+I+"] = "+X[I]);
            }
    }
}