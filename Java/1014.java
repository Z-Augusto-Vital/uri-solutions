/*
URI Online Judge | 1014

 1014 - Consumo
Adaptado por Neilor Tonin, URI Brasil 

Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
Entrada

O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
Saída

Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int v1 = scan.nextInt();
       double v2 = scan.nextDouble();
       DecimalFormat formatador = new DecimalFormat("0.000");
       double consumo = v1/v2;

       System.out.print(formatador.format(consumo));
       System.out.println(" km/l");

    }
}
