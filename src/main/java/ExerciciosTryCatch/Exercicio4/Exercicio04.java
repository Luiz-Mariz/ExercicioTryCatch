package ExerciciosTryCatch.Exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira dois números para realizar uma soma: ");
            Double numero1 = sc.nextDouble();
            Double numero2 = sc.nextDouble();

            System.out.println("Resultado da soma: " + (numero1 + numero2));
        }
        catch (InputMismatchException exception){
            System.out.println("Erro valor isesrido não é um numero");
        }
        finally {
            sc.close();
        }
    }
}
