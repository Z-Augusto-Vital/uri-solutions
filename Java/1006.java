/*
URI Online Judge | 1006

 1006 - Média 2
Adaptado por Neilor Tonin, URI Brasil 

Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
Entrada

O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
Saída

Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       double v1 = scan.nextDouble();
       double v2 = scan.nextDouble();
       double v3 = scan.nextDouble();
       DecimalFormat formatador = new DecimalFormat("0.0");
       double media = (2*v1+3*v2+5*v3) / 10;


       System.out.println("MEDIA = " + formatador.format(media));
    }
}
