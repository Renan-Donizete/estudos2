package aulaex17;

import java.util.Scanner;

/**
 *
 * @author 11868790681
 */
public class aula17 {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Digite um numero inteiro: ");
    n = scanner.nextInt();
    
    for(int i = 2; i < n; i+=2){
        System.out.println(i);
    }
}
}
