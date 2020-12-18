/*
URI Online Judge | 1075

 1075-Resto 2
Adaptado por Neilor Tonin, URI Brasil 

Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
Entrada

A entrada contém um valor inteiro N (N < 10000).
Saída

Imprima todos valores que quando divididos por N dão resto = 2, um por linha.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] v = new int[10000];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0;i < 10000;i++){ 
			v[i] = i;
			if(v[i] % n == 2){
				System.out.println(v[i]);
			}	
		}
	}
}
