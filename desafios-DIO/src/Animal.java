import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args)  throws IOException {
    
        Scanner sc = new Scanner(System.in);
        
        String AN1,AN2,AN3;
        
        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();
    
        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
    
        if(AN1.equals("vertebrado")){
            //System.out.println("é vertebrado.");
            if(AN2.equals("ave")){
                //System.out.println("é ave.");
                if(AN3.equals("carnivoro")){
                    System.out.println("aguia.");//
                }else{
                    System.out.println("pomba.");//
                }
            }else{
                //System.out.println("é mamifero.");
                if(AN3.equals("onivoro")){
                    System.out.println("homem.");//
                }else{
                    System.out.println("vaca.");//
                }
            }
            
        }else{
            //System.out.println("é invertebrado.");
            if(AN2.equals("inseto")){
               // System.out.println("é inseto.");
                if(AN3.equals("hematofago")){
                    System.out.println("pulga.");//
                }else{
                    System.out.println("lagarta.");//
                }
            }else{
                //System.out.println("é anilideo.");
                if(AN3.equals("onivoro")){
                    System.out.println("minhoca.");//
                }else{
                    System.out.println("sanguessuga.");//
                }
            }
        }
    }
}
