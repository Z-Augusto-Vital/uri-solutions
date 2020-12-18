/*
URI Online Judge | 1046

 1046 -Tempo de Jogo
Adaptado por Neilor Tonin, URI Brasil 

Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Entrada

A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
Saída

Apresente a duração do jogo conforme exemplo abaixo.


Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		int count = 0;
		int aux = 0;
		int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
		 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 0};
		if(h1 == h2){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		if(h1 > h2){		
			aux = h1;
			while(v[aux] != v[h2]){
				if(aux == 24){
					aux = 0;
				}
				aux++;
				count++;
			}
		System.out.println("O JOGO DUROU "  + count + " HORA(S)");
		}
		else if(h1 < h2){
			int horas =	h2 - h1;
		System.out.println("O JOGO DUROU "  + horas + " HORA(S)");
		}	
	}
}	

