import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int IN,GR,INv=0,GRv=0,E=0,N=0,C=0;
        
            do {
                IN = sc.nextInt();
                GR = sc.nextInt();
                
                if (IN>GR) {
                    ++INv;
                    
                    System.out.println("Novo grenal (1-sim 2-nao)");
                    N = sc.nextInt();
                }
                else if (GR>IN) {
                    ++GRv;
                    
                    System.out.println("Novo grenal (1-sim 2-nao)");
                    N = sc.nextInt();
                }
                else {
                    ++E;
                    
                    System.out.println("Novo grenal (1-sim 2-nao)");
                    N = sc.nextInt();
                }
                ++C;
                
            } while(N==1);
            
            System.out.println(C+" grenais");
            System.out.println("Inter:"+INv);
            System.out.println("Gremio:"+GRv);
            System.out.println("Empates:"+E);
            
                if (INv>GRv) {
                    System.out.println("Inter venceu mais");
                }
                else {
                    System.out.println("Gremio venceu mais");
                }
            
    }
}