/*
URI Online Judge | 1873

 1873 - Pedra-papel-tesoura-lagarto-Spock
Por Ricardo Martins, IFSULDEMINAS BR Brazil

Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

    Tesoura corta papel
    Papel cobre pedra
    Pedra derruba lagarto
    Lagarto adormece Spock
    Spock derrete tesoura
    Tesoura prende lagarto
    Lagarto come papel
    Papel refuta Spock
    Spock vaporiza pedra
    Pedra quebra tesoura

Um dia, dois amigos, Rajesh e Sheldon, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.
Entrada

Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro C, representando a quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Rajesh e de Sheldon, respectivamente.
Saída

Para cada caso de teste, imprima quem venceu, ou se houve empate.
Programmer: José Augusto Vital
*/
CODE:
#include <stdio.h>
#include <string.h>


int main (void){
  char ele[100];
  char ele2[100];
  int n,i;

  scanf("%d", &n);
  for(i = 0;i < n;i++){
  scanf("%s %s", ele, ele2);

  if(strcmp(ele, ele2) == 0){
    printf("empate\n");
  }
  if(strcmp(ele, "tesoura") == 0 && ((strcmp(ele2, "papel") == 0) || (strcmp(ele2, "lagarto") == 0))){
      printf("rajesh\n");
  }
  if(strcmp(ele, "papel") == 0 && ((strcmp(ele2, "pedra") == 0) || (strcmp(ele2, "spock") == 0))){
      printf("rajesh\n");
  }
  if(strcmp(ele, "pedra") == 0 && ((strcmp(ele2, "lagarto") == 0) || (strcmp(ele2, "tesoura") == 0))){
      printf("rajesh\n");
  }
  if(strcmp(ele, "lagarto") == 0 && ((strcmp(ele2, "spock") == 0) || (strcmp(ele2, "papel") == 0))){
      printf("rajesh\n");
  }
  if(strcmp(ele, "spock") == 0 && ((strcmp(ele2, "tesoura") == 0) || (strcmp(ele2, "pedra") == 0))){
      printf("rajesh\n");
  }

  if(strcmp(ele2, "tesoura") == 0 && ((strcmp(ele, "papel") == 0) || (strcmp(ele, "lagarto") == 0))){
      printf("sheldon\n");
  }
  if(strcmp(ele2, "papel") == 0 && ((strcmp(ele, "pedra") == 0) || (strcmp(ele, "spock") == 0))){
      printf("sheldon\n");
  }
  if(strcmp(ele2, "pedra") == 0 && ((strcmp(ele, "lagarto") == 0) || (strcmp(ele, "tesoura") == 0))){
      printf("sheldon\n");
  }
  if(strcmp(ele2, "lagarto") == 0 && ((strcmp(ele, "spock") == 0) || (strcmp(ele, "papel") == 0))){
      printf("sheldon\n");
  }
  if(strcmp(ele2, "spock") == 0 &&((strcmp(ele, "tesoura") == 0) || (strcmp(ele, "pedra") == 0)) ){
      printf("sheldon\n");
  }
  
}
  return 0;
}
