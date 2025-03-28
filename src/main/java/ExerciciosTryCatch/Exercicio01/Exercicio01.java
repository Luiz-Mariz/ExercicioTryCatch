package ExerciciosTryCatch.Exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int resultado;

        try {
            resultado = numero1 /numero2;
            System.out.println(resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
        }

    }
}
