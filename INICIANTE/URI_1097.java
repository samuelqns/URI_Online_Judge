public class Main {
    public static void main(String [] args){
        
        int J,I;
        
            for(I=1,J=7;J<=15;I=I+2,J=I+6 ) {
                System.out.println("I="+I+" J="+J);
                System.out.println("I="+I+" J="+(J-1));
                System.out.println("I="+I+" J="+(J-2));
            }
    }
}