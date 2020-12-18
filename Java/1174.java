/*
URI Online Judge | 1174

 1174 - Seleçao em Vetor I
Adaptado por Neilor Tonin, URI Brasil 

Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
Entrada

A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
Saída

Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.

Programmer: José Augusto Vital
*/

CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
		DecimalFormat formatador = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		double[] v = new double[100];
		for(int i = 0; i < 100;i++){
			v[i] = sc.nextDouble();			
		}
		for(int i = 0; i < 100;i++){
			if(v[i] <= 10){
				System.out.println("A["+i+"] = " +formatador.format(v[i]));
			}
		}
	}
}
