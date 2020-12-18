/*
URI Online Judge | 1064

 1064 -Positivos e Média
Adaptado por Neilor Tonin, URI Brasil 

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
Entrada

A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.
Saída

O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;
	import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args){
		DecimalFormat formatador = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
		double[] v = new double[6];
		double[] s = new double[6];
		int j = 0;
		int count = 0;
		double media = 0;
		for(int i = 0;i < 6;i++){
			v[i] = sc.nextDouble();
		}

		for(int i = 0;i < 6;i++){
			if(v[i] > 0){
				count++;
				s[j] = v[i];
				j++;
			}
		} 

		System.out.println(count + " valores positivos");
		for(j = 0;j < 6;j++){
			media += s[j];
		}
		media = media/count;
		System.out.println(formatador.format(media));
	}
}
