package aulaex6;

/**Exercício 06
 * Aula:
 * Disciplina: Operadores Atribuição e Aritméticos
 * Data: 15/08/2023
 * Materia: Entrada de dados
 * @author Renan Donizete
 *
 */
public class aula06 {
    public static void main(String[]args){
       float nota1 = 10;
       float nota2 = 9;
       float nota3 = 8;
       float nota4 = 3;
       
       float media, soma =0;
       soma = nota1 + nota2 + nota3 + nota4;
       media = soma / 4;
       System.out.println("Soma:"+ soma);
       System.out.println("Media:"+ media);
    }
}
