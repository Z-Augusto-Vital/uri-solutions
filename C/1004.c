/*
URI Online Judge | 1004

1004 - Produto Simples
Adaptado por Neilor Tonin, URI Brasil

Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   
Entrada

O arquivo de entrada contém 2 valores inteiros.
Saída

Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Programmer: José Augusto Vital
*/
CODE:
#include <stdio.h>
#include <math.h>
int main (){
int a, b, soma;
	scanf("%d", &a);
	scanf("%d", &b);

	soma = a * b;
	printf("PROD = %d\n", soma);
	
	return 0;
}
