package aulaex14;

import java.util.Scanner;

/**
 *
 * @author 11868790681
 */
public class aula14 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int escolha;
    
    do {
        System.out.println("Menu");
        System.out.println("1. Hamburger");
        System.out.println("2. Cheeseburger");
        System.out.println("3. Fritas");
        System.out.println("4. Refrigerante");
        System.out.println("5. Milkshake");
        System.out.println("Escolha uma opçao");
        escolha = scanner.nextInt();
        
        switch (escolha){
            case 1:
               System.out.println("Hamburger: R$30,00");
               break;
           case 2:
               System.out.println("Cheeseburger: R$35,50");
               break;
           case 3:
               System.out.println("Fritas: R$20,50");
               break;
           case 4:
               System.out.println("Refrigerante: R$10,00");
               break;
           case 5:
               System.out.println("Milkshake: R$30,00");
               break;
           default:
               System.out.println("opção invalida.");
               break;
        }
        System.out.println("---------------------------------");
    }while (escolha !=0);
    }
}
