package ExerciciosTryCatch.Exercicio10;

import java.util.Scanner;

import static ExerciciosTryCatch.Exercicio10.Recursion.factorial;


public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira um numero positivo até 20 para saber seu valor fatorial: ");
            int numero = sc.nextInt(), result;
            result = factorial(numero);
            if (numero < 0){
                throw new NumeroNegativoException("Erro numero negativo");
            }

            if (numero > 20){
                throw new LimiteFatorialExcedidoException("Numero maior que 20");
            }

            System.out.println(result);
        }
        catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
        catch (LimiteFatorialExcedidoException e){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}
