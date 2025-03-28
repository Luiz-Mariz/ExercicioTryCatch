package ExerciciosTryCatch.Exercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira três notas para a media ser feita: ");
            Double nota1 = sc.nextDouble();
            Double nota2 = sc.nextDouble();
            Double nota3 = sc.nextDouble();

            Double media = (nota1 + nota2 + nota3) / 3;
            System.out.println(media);

        }
        catch (InputMismatchException e ){
            System.out.println("Valor inserido não é um número");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
        }
    }
}
