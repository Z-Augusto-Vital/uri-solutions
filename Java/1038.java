/*
URI Online Judge | 1038

 1038 - Lanche
Adaptado por Neilor Tonin, URI Brasil 

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada

O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
Saída

O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       DecimalFormat formatador = new DecimalFormat("0.00");
       double v1 = scan.nextDouble();
       double v2 = scan.nextDouble();
       double valor = 0;
       if(v1 == 1){
        valor = v2*4;
       }
       else if(v1 == 2){
        valor = v2*4.5;
       }
       else if(v1 == 3){
        valor = v2*5;
       }
       else if(v1 == 4){
        valor = v2*2;
       }
       else{
        valor = v2*1.5;
       }    
       System.out.println("Total: R$ " + formatador.format(valor)); 
    }
}
