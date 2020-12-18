/*
URI Online Judge | 1019

 1019 - Conversão de Tempo
Adaptado por Neilor Tonin, URI Brasil 

Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada

O arquivo de entrada contém um valor inteiro N.
Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int v1 = scan.nextInt();
       int horas = 0;
       int minutos = 0;
       int aux = v1;
       while(aux/3600 >= 1){
       	horas++;
       	 aux -= 3600;
       }
       while(aux/60 >= 1){
       	minutos++;
       	aux -= 60;
       }


       System.out.println(horas + ":" + minutos + ":" + aux);


    }
}
