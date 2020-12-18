/*
URI Online Judge | 1036

1036- Fórmula de Bhaskara
Adaptado por Neilor Tonin, URI Brasil

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
Entrada

Leia três valores de ponto flutuante (double) A, B e C.
Saída

Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.


Programmer: José Augusto Vital
*/

CODE:
#include <stdio.h>
#include <math.h>

int main (void){
 double a, b, c, d, e, f;
	
 scanf("%lf %lf %lf", &a, &b, &c);

 d = pow(b,2) - 4*a*c;
 if(d < 0 || a == 0)
 {
	printf("Impossivel calcular\n");
 }
 else if(d >= 0.0)
 {
	e =	(-b + sqrt(d)) / (2*a);
	f =	(-b - sqrt(d)) / (2*a);
	printf("R1 = %.5lf\n", e);
   	printf("R2 = %.5lf\n", f);
 }

	return 0;
}
