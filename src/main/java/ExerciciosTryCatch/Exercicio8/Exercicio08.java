package ExerciciosTryCatch.Exercicio8;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe sua idade: ");
            int idade = sc.nextInt();

            if (idade < 0) {
                throw new IdadeInvalidaException("A idade não pode ser negativa!");
            }

            if (idade >= 18){
                System.out.println("Você e maior de idade: ");
            }
            else {
                System.out.println("Você e menor de idade");
            }

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro" + e.getMessage());
        }
        finally {
            sc.close();
        }

    }
}
