/*
URI Online Judge | 1180

 1180 - Menor e Posição
Adaptado por Neilor Tonin, URI Brasil 

Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.
Entrada

A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor X[N] de inteiros. A segunda linha contém cada um dos N valores, separados por um espaço.
Saída

A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.

Programmer: José Augusto Vital
*/

CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int menor = 0, pos = 0;
		int n = sc.nextInt();
		int[] v = new int[n];
		int count = 0;
		for(int i = 0;i < n;i++){
			v[i] = sc.nextInt();
		}
		menor = v[0];
		pos = 0;
		for(int i = 0;i < n;i++){
			if(v[i] < menor){
				menor = v[i];
				pos = i;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posicao: "+pos);
	}
} 
