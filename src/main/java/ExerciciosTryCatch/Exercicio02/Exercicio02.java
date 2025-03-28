package ExerciciosTryCatch.Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insira um numero: ");
            Double numero = sc.nextDouble();
        }
        catch (NumberFormatException e){
            System.out.println("Valor invalido");
        }
        finally {
            sc.close();
        }
    }
}
