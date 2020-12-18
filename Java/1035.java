/*
URI Online Judge | 1035

 1035 - Teste de Seleção 1
Adaptado por Neilor Tonin, URI Brasil 

Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
Entrada

Quatro números inteiros A, B, C e D.
Saída

Mostre a respectiva mensagem após a validação dos valores.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       int d = scan.nextInt();
       
       if((b > c)&& (d > a) && (c + d) > (a + b) && (c > 0) && (d > 0) && (a % 2 == 0)){
       System.out.println("Valores aceitos");
        }
        else
       System.out.println("Valores nao aceitos");
    }
}
