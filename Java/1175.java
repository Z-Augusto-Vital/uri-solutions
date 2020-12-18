/*
URI Online Judge | 1175

 1175 - Troca em Vetor I
Adaptado por Neilor Tonin, URI Brasil 

Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
Entrada

A entrada contém 20 valores inteiros, positivos ou negativos.
Saída

Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.

Programmer: José Augusto Vital
*/

CODE:
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] v = new int[20];
		int aux;
		for(int i = 0;i < 20;i++){
			v[i] = sc.nextInt();
		}
	
			for(int i = 0;i < (v.length)/2; i++){
				aux = v[i];
				v[i] = v[v.length - 1 -i];
				v[v.length - 1 -i] = aux;
			}
		
		for(int i = 0; i < v.length;i++){
			System.out.println("N["+i+"] = "+ v[i]);
		}
	}
}
