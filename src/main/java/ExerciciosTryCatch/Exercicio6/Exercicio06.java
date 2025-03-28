package ExerciciosTryCatch.Exercicio6;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira um nome: ");
            String nome = sc.next();

            if(nome.isEmpty()){
                throw new Erros("Erro nome");
            }

            System.out.println("Insira uma idade: ");
            int idade = sc.nextInt();

            if (idade < 0){
                throw new Erros("Idade negativa");
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
        catch (Erros e) {
            System.out.println("Erro" + e.getMessage());
        }
        finally {
            sc.close();
        }
        System.out.println("Programa finalizado");
    }
}
