import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        String p1,p2,p3;
        
        p1 = sc.nextLine();
        p2 = sc.nextLine();
        p3 = sc.nextLine();
        
        if ("vertebrado".equals(p1) && "ave".equals(p2) && "carnivoro".equals(p3)) {
            System.out.println("aguia");
        }
        else if ("vertebrado".equals(p1) && "ave".equals(p2) && "onivoro".equals(p3)) {
            System.out.println("pomba");
        }
        else if ("vertebrado".equals(p1) && "mamifero".equals(p2) && "onivoro".equals(p3)) {
            System.out.println("homem");
        }
        else if ("vertebrado".equals(p1) && "mamifero".equals(p2) && "herbivoro".equals(p3)) {
            System.out.println("vaca");
        }
        else if ("invertebrado".equals(p1) && "inseto".equals(p2) && "hematofago".equals(p3)) {
            System.out.println("pulga");
        }
        else if ("invertebrado".equals(p1) && "inseto".equals(p2) && "herbivoro".equals(p3)) {
            System.out.println("lagarta");
        }
        else if ("invertebrado".equals(p1) && "anelideo".equals(p2) && "hematofago".equals(p3)) {
            System.out.println("sanguessuga");
        }
        else if ("invertebrado".equals(p1) && "anelideo".equals(p2) && "onivoro".equals(p3)) {
            System.out.println("minhoca");
        }
    }
}