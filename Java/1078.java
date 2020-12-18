/*
URI Online Judge | 1078

 1078 - Tabuada
Adaptado por Neilor Tonin, URI Brasil 

Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N
Entrada

A entrada contém um valor inteiro N (2 < N < 1000).
Saída

Imprima a tabuada de N, conforme o exemplo fornecido.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] v = new int[10];
		for(int i = 0;i < 10;i++){
			v[i] = (i+1);
		}
		int n = sc.nextInt();

		for(int i = 0; i < 10;i++){
			System.out.println(v[i]+" x "+n+" = "+(v[i]*n));
		}
	}
}
