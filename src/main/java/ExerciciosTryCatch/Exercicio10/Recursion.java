package ExerciciosTryCatch.Exercicio10;

public class Recursion {
    static int factorial( int n ) {

        if (n != 0)

            return n * factorial(n-1);
        else
            return 1;
    }
}
