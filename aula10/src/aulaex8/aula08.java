package aulaex8;

/**Exercício 07
 * Aula:
 * Disciplina: Operadores Atribuição e Aritméticos
 * Data: 15/08/2023
 * Materia: Entrada de dados
 * @author Renan Donizete
 */
public class aula08 {
   public static void main(String[] args){
       int a = 5;
       int b = 10;
       
       System.out.println(a > b && a < b);
       
       if(a > b){
           System.out.println("maior");   
   }else if(a < b){
       System.out.println("Menor");
   }else{
       System.out.println("Igual");
   }
}
}
