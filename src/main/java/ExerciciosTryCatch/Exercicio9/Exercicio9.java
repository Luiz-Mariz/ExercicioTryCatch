package ExerciciosTryCatch.Exercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira um valor em Celcios para converter em Fahrenheit: ");
            Double temperatura = sc.nextDouble();

            if (temperatura < -273.15){
                throw new TemperaturaInvalidaException("Temperatura menor que o zero absoluto");
            }

            Double temperaturaConvertida = (temperatura * 9 / 5) + 32;
            System.out.println(temperaturaConvertida);
        }
        catch (TemperaturaInvalidaException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Valor não numérico ");
        }
        finally {
            sc.close();
        }
    }
}
