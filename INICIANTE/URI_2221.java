import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int T,B,AD,DD,LD,VD,AG,DG,LG,VG;
        
        T = sc.nextInt();
        
            do {
                B = sc.nextInt();
                
                AD = sc.nextInt(); DD = sc.nextInt(); LD = sc.nextInt();
                
                    if (LD%2==0) {
                        VD = (AD+DD)/2+B;
                    }
                    else {
                        VD = (AD+DD)/2;
                    }
                
                AG = sc.nextInt(); DG = sc.nextInt(); LG = sc.nextInt();
                
                    if (LG%2==0) {
                        VG = (AG+DG)/2+B;
                    }
                    else {
                        VG = (AG+DG)/2;
                    }
                    
                    if (VD==VG) {
                        System.out.println("Empate");
                    }
                    else {
                        if (VD>VG) {
                            System.out.println("Dabriel");
                        }
                        else {
                            if (VG>VD) {
                                System.out.println("Guarte");
                            }
                        }
                    }
                
                --T;
            } while(T>0);
    }
}