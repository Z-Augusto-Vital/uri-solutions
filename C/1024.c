/*
URI Online Judge | 1024

 1024 - Criptografia
Por Neilor Tonin, URI Brasil

Solicitaram para que você construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codificadas sem que alguém consiga lê-las. O processo é muito simples. São feitas três passadas em todo o texto.

Na primeira passada, somente caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverá ser invertida. Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

Por exemplo, se a entrada for “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser “3# rvzgV”.
Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de linhas que o problema deve tratar. As N linhas contém cada uma delas M (1 ≤ M ≤ 1*103) caracteres.
Saída

Para cada entrada, deve-se apresentar a mensagem criptografada.

Programmer: José Augusto Vital
*/
CODE:
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
int main(){
	int n, i=0, x;
	char str[10000];

	scanf("%d\n", &n);

	while(i < n){
		
		int j=0;
		scanf(" %[^\n]s\n", str);

		x = strlen(str);

		while(j < x){
			int k;
			if(str[j] >= 'a' && str[j] <= 'z'){
				str[j] = str[j] + 3;
			}else if(str[j] >= 'A' && str[j] <= 'Z'){
				str[j] = str[j] + 3;
			}

		j++;

		}

		char c;
		int m;

		for(m=0; m<x/2;m++){
			c = str[m];
			str[m] = str[x-1-m];
			str[x-1-m] = c;
		}
		int a, b;
		
		for (a = x/2; a < x; a++)
		{
			str[a] = str[a] - 1;

		}
		printf("%s\n", str);
		
	i++;
	}


   return 0;
}
