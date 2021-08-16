import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int dia,mes,S;
        int jan=31,fev=29,mar=31,abr=30,mai=31,jun=30,jul=31,ago=31,set=30,out=31,nov=30;
        
            while(sc.hasNext()) {
                mes = sc.nextInt(); dia = sc.nextInt();
                
                    if (mes==12 && dia==25) {
                        System.out.println("E natal!");
                    }
                    else {
                        if (mes==12 && dia==24) {
                            System.out.println("E vespera de natal!");
                        }
                        else {
                            if (mes==12 && dia>25) {
                                System.out.println("Ja passou!");
                            }
                            else {
                                if (mes==12 && dia<25) {
                                    S = 25-dia;
                                    System.out.println("Faltam "+S+" dias para o natal!");
                                }
                            }
                        }
                    }
                    
                    if (mes==11) {
                        S = nov-dia+25;
                        System.out.println("Faltam "+S+" dias para o natal!");
                    }
                    else {
                        if (mes==10) {
                            S = nov+out-dia+25;
                            System.out.println("Faltam "+S+" dias para o natal!");
                        }
                        else {
                            if (mes==9) {
                                S = nov+out+set-dia+25;
                                System.out.println("Faltam "+S+" dias para o natal!");
                            }
                            else {
                                if (mes==8) {
                                    S = nov+out+set+ago-dia+25;
                                    System.out.println("Faltam "+S+" dias para o natal!");
                                }
                                else {
                                    if (mes==7) {
                                        S = nov+out+set+ago+jul-dia+25;
                                        System.out.println("Faltam "+S+" dias para o natal!");
                                    }
                                    else {
                                        if (mes==6) {
                                            S = nov+out+set+ago+jul+jun-dia+25;
                                            System.out.println("Faltam "+S+" dias para o natal!");
                                        }
                                        else {
                                            if (mes==5) {
                                                S = nov+out+set+ago+jul+jun+mai-dia+25;
                                                System.out.println("Faltam "+S+" dias para o natal!");
                                            }
                                            else {
                                                if (mes==4) {
                                                    S = nov+out+set+ago+jul+jun+mai+abr-dia+25;
                                                    System.out.println("Faltam "+S+" dias para o natal!");
                                                }
                                                else {
                                                    if (mes==3) {
                                                        S = nov+out+set+ago+jul+jun+mai+abr+mar-dia+25;
                                                        System.out.println("Faltam "+S+" dias para o natal!");
                                                    }
                                                    else {
                                                        if (mes==2) {
                                                            S = nov+out+set+ago+jul+jun+mai+abr+mar+fev-dia+25;
                                                            System.out.println("Faltam "+S+" dias para o natal!");
                                                        }
                                                        else {
                                                            if (mes==1) {
                                                                S = nov+out+set+ago+jul+jun+mai+abr+mar+fev+jan-dia+25;
                                                                System.out.println("Faltam "+S+" dias para o natal!");
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
            }
    }
}