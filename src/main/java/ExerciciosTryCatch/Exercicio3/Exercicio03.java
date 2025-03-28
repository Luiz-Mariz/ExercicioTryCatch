package ExerciciosTryCatch.Exercicio3;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insira um numero para saber raiz: ");
            Double numero = sc.nextDouble();
            if (numero < 0) {
                throw new IllegalArgumentException("Error");
            }
            System.out.println(Math.sqrt(numero));
        }
        catch (IllegalArgumentException exception){
            System.out.println("Erro numero negativo");
        }

    }
}
