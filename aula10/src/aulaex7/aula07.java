package aulaex7;

import java.util.Scanner;

/**Exercício 07
 * Aula:
 * Disciplina: Operadores Atribuição e Aritméticos
 * Data: 15/08/2023
 * Materia: Entrada de dados
 * @author Renan Donizete
 */
public class aula07 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual nome do Aluno?");
        String nome = ler.next();
        
        System.out.println("Qual a primeira nota?");
        float nota1 = ler.nextFloat();
        System.out.println("Qual e a segunda nota?");
        float nota2 = ler.nextFloat();
        System.out.println("Qual e a segunda nota?");
        float nota3 = ler.nextFloat();
        System.out.println("Qual e a segunda nota?");
        float nota4 = ler.nextFloat();
        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4;
        System.out.println("a media: "+ media);
   }
}