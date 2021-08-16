import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int I,A,S=0,G;
        
            for (I=1;I<=9;++I) {
                A = sc.nextInt();
                S += A;
            }
            
        G = S%9;
        
            if (G==0) {
                G = 9;
            }
            
            if (G==1) {
                System.out.println("Dasher");
            }
            else {
                if (G==2) {
                    System.out.println("Dancer");
                }
                else {
                    if (G==3) {
                        System.out.println("Prancer");
                    }
                    else {
                        if (G==4) {
                            System.out.println("Vixen");
                        }
                        else {
                            if (G==5) {
                                System.out.println("Comet");
                            }
                            else {
                                if (G==6) {
                                    System.out.println("Cupid");
                                }
                                else {
                                    if (G==7) {
                                        System.out.println("Donner");
                                    }
                                    else {
                                        if (G==8) {
                                            System.out.println("Blitzen");
                                        }
                                        else {
                                            if (G==9) {
                                                System.out.println("Rudolph");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }
}