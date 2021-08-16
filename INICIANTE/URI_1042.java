import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int A,B,C;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
            if (C>B && C>A && B>A) {
                System.out.println(A+"\n"+B+"\n"+C);
            }
            else if (B>C && B>A && C>A) {
                System.out.println(A+"\n"+C+"\n"+B);
            }
            else if (C>A && C>B && A>B) {
                System.out.println(B+"\n"+A+"\n"+C);
            }
            else if (B>A && B>C && A>C) {
                System.out.println(C+"\n"+A+"\n"+B);
            }
            else if (A>C && A>B && C>B) {
                System.out.println(B+"\n"+C+"\n"+A);
            }
            else if (A>B && A>C && B>C) {
                System.out.println(C+"\n"+B+"\n"+A);
            }
        
        System.out.println("\n"+A+"\n"+B+"\n"+C);
    }
}