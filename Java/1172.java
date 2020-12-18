/*
URI Online Judge | 1172

 1172 - Substituição em Vetor I
Adaptado por Neilor Tonin, URI Brasil 

Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. Em seguida mostre o vetor X.
Entrada

A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
Saída

Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] v = new int[10];

		for(int i = 0;i < 10;i++){
			v[i] = sc.nextInt();
			if(v[i] <= 0){
				v[i] = 1;
			}
		}

		for(int i = 0;i < 10;i++){
			System.out.println("X["+i+"] = "+v[i]);
		}
	}
}
