/*
URI Online Judge  | 2591

 2591 - HameKameKa
Por Ricardo Martins, IFSULDEMINAS BR Brazil

O Hamekameka foi inventado por Mestre Hame praticado por cinquenta anos antes de conhecer Kogu. Chamando sua energia latente nas palmas de suas mãos, Hame consegue lançar um raio explosivo de energia. Kogu aprende após ver Mestre Hame usando-o para apagar as chamas na casa de um Rei. Para a surpresa de Hame, Kogu consegue performar a técnica de primeira, embora seja apenas forte o suficiente para destruir o carro que Chamya deu para Mulba. Kogu descobriu que há um padrão na pronúncia correta deste ataque, de modo que, se não for pronunciado corretamente, o mesmo não acontece.

Escreva um programa que, dada a parte inicial de um Hamekameka, faça a finalização ideal para que o ataque seja realizado com sucesso.
Entrada

A entrada começa com um valor C, indicando a quantidade de casos de teste. Em seguida, temos C linhas, cada uma com o início de um ataque, com, no máximo, 200 letras.
Saída

Para cada caso de teste, imprima a finalização adequada, para que o ataque se concretize.


Programmer: José Augusto Vital
*/
CODE:
#include <stdio.h>
#include <string.h>


int main (void){
  char entrada[200];
  int n, i, p, j = 0;
  int w = 0;
  int r = 0;
  int a = 0;


  scanf("%d", &n);
  for(i = 0;i < n;i++){
    scanf("%s", entrada);

    for(p = 0;entrada[p] !='\0';p++){
      if(entrada[p] == 'a'){
      	j = j+1;
    }
    if(entrada[p] == 'k'){
      	while(entrada[p+1] == 'a'){
      		w++;
      		p++;
      	}
     }
  }
    

  r = j*w;
 printf("k");
 while(a != r){
 	printf("a");
 	a++;
  }
  printf("\n");
  w = 0;
  r = 0;
  a = 0;
  j = 0;


  
	}
  return 0;
}
