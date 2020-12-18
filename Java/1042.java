/*
URI Online Judge | 1042

 10042- Sort Simpless
Adaptado por Neilor Tonin, URI Brasil 

Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
Entrada

A entrada contem três números inteiros.
Saída

Imprima a saída conforme foi especificado.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int v1 = scan.nextInt();
       int v2 = scan.nextInt();
       int v3 = scan.nextInt();

       int aux1 = v1;
       int aux2 = v2;
       int aux3 = v3;

       if(aux1 < aux2 && aux1 < aux3){
        if(aux2 < aux3){
           System.out.println(aux1);
           System.out.println(aux2);
           System.out.println(aux3);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);
        }
        else{
           System.out.println(aux1);
           System.out.println(aux3);
           System.out.println(aux2);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);           
        }
       }
       else if(aux2 < aux1 && aux2 < aux3){
          if(aux1 < aux3){
           System.out.println(aux2);
           System.out.println(aux1);
           System.out.println(aux3);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);
          }
          else{
           System.out.println(aux2);
           System.out.println(aux3);
           System.out.println(aux1);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);   
          }
       }
       else if(aux3 < aux1 && aux3 < aux2){
          if(aux1 < aux2){
           System.out.println(aux3);
           System.out.println(aux1);
           System.out.println(aux2);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);
          }
          else{
           System.out.println(aux3);
           System.out.println(aux2);
           System.out.println(aux1);
           System.out.println();
           System.out.println(v1);
           System.out.println(v2);
           System.out.println(v3);

          }
       }      
    }
}
