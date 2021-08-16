import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int C,X,Y,S;
        
        C = sc.nextInt();
        
            do {
                X = sc.nextInt();
                Y = sc.nextInt();
                S = X+Y;
                
                    if (S==0) {
                        System.out.println("PROXYCITY");
                    }
                    else {
                        if (S==1) {
                            System.out.println("P.Y.N.G.");
                        }
                        else {
                            if (S==2) {
                                System.out.println("DNSUEY!");
                            }
                            else {
                                if (S==3) {
                                    System.out.println("SERVERS");
                                }
                                else {
                                    if (S==4) {
                                        System.out.println("HOST!");
                                    }
                                    else {
                                        if (S==5) {
                                            System.out.println("CRIPTONIZE");
                                        }
                                        else {
                                            if (S==6) {
                                                System.out.println("OFFLINE DAY");
                                            }
                                            else{
                                                if (S==7){
                                                    System.out.println("SALT");
                                                }
                                                else {
                                                    if (S==8) {
                                                        System.out.println("ANSWER!");
                                                    }
                                                    else {
                                                        if (S==9) {
                                                            System.out.println("RAR?");
                                                        }
                                                        else {
                                                            if (S==10) {
                                                                System.out.println("WIFI ANTENNAS");
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
                
                C -= 1;
                
            } while(C>0);
    }
}