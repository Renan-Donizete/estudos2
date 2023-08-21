package aulaex9;

import java.util.Scanner;

/**Exercício 07
 * Aula:
 * Disciplina: Operadores Atribuição e Aritméticos
 * Data: 15/08/2023
 * Materia: Entrada de dados
 * @author Renan Donizete
 */
public class aula09 {
   public static void main(String[] args){
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite o valor A:");
       float A = ler.nextFloat();
        System.out.println("Digite o valor B:");
       float B = ler.nextFloat();
        if(A > B){
           System.out.println("maior");   
   }else if(A < B){
       System.out.println("Menor");
   }else{
       System.out.println("Igual");
   }
       
        
   } 
}
