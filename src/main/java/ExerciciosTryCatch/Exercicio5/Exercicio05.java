package ExerciciosTryCatch.Exercicio5;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe um indicice para um array: ");
            int indice = sc.nextInt();
            int[] array = new int[10];
            System.out.println(array[indice]);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Posição invalida");
        }
        finally {
            sc.close();
        }
    }
}
