import java.util.Scanner;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt(); //le kg de morango 
        int macas = input.nextInt(); //le kg de macas
        double preçoMorango;
        double preçoMaca;
//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
      
        if(morangos <= 5){//se os kg de morango for menor ou = a 5
            preçoMorango = 2.50 * morangos;
        }else{
            preçoMorango = 2.20 * morangos;
        }

        if(macas <= 5 ){//se os kg de maca for menor ou = a 5
            preçoMaca = 1.80 * macas;
        }else{
            preçoMaca = 1.50 * macas;
        }

        double preçoTotal = preçoMaca + preçoMorango;
        if((macas + morangos) >= 8 || (preçoTotal) > 25 ){
            preçoTotal = preçoTotal - (preçoTotal * 0.10);
        }

        System.out.println(preçoTotal);
    }
}
