/*
URI Online Judge | 1051

 1051 - Imposto de Renda
Adaptado por Neilor Tonin, URI Brasil 

Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.
Entrada

A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.
Saída

Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento".


Programmer: José Augusto Vital
*/
CODE:
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double aux = salario;
		double parte1 = 0.00, parte2 = 0.00, parte3 = 0.00;
		double final1 = 0.00, final2 = 0.00, final3 = 0.00;
		double impRenda = 0.00;
      	DecimalFormat formatador = new DecimalFormat("0.00");
		if(aux <= 2000.00){
			System.out.println("Isento");
		}

		if(aux > 4500.00){
			parte3 = aux - 4500;
			final3 = parte3 * 0.28;
		}
		if(aux-parte3 > 3000.01 && aux-parte3 <= 4500.00){
			parte2 = aux-parte3-3000.00;
			final2 = parte2 * 0.18;
		}
		if(aux-parte3-parte2 > 2000.01 && aux-parte3-parte2 <= 3000.00){
			parte1 = aux-parte3-parte2-2000.00;
			final1 = parte1 * 0.08;
		}
		if(aux > 2000.00){
		impRenda = final1+final2+final3;
		System.out.println("R$ " + formatador.format(impRenda));
		}
	}
}
