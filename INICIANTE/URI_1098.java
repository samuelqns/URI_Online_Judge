public class Main {
    public static void main(String [] args){
        
        double J,I,i;
        
            for(I=0,J=1;I<=2;I=I+0.2,J=J+0.2) {
                if (I==(int)I || I>1.8) {
                    System.out.printf("I=%.0f J=%.0f\n", I,J);
                    System.out.printf("I=%.0f J=%.0f\n", I,(J+1));
                    System.out.printf("I=%.0f J=%.0f\n", I,(J+2));
                }
                else {
                    System.out.printf("I=%.1f J=%.1f\n", I,J);
                    System.out.printf("I=%.1f J=%.1f\n", I,(J+1));
                    System.out.printf("I=%.1f J=%.1f\n", I,(J+2));
                }
            }
    }
}