import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N,I,J;
        
        while (sc.hasNext())
        {
            N = sc.nextInt();
        
            for (I=0;I<N;I++) {
                for (J=0;J<N;J++) {
                    if (I+J==N-1) {
                        System.out.print("2");
                    }
                    else
                    {
                        if (I==J) {
                            System.out.print("1");
                        }
                        else {
                            System.out.print("3");
                        }
                    }
                }
                System.out.println("");
            }
        }
        
    }
}