import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double soma;
		
    //se for triangulo 
        if(A + B > C && B + C > A && A + C > B){
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);
        }else{
            System.out.println("Area = " + ((A+B) * C) / 2);
        }

	}
}
