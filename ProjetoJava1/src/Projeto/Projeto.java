package Projeto;

import java.util.Scanner;

public class Projeto {
	public static void main (String args[])
	{
		int aula,lc,lr,v,m;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nBom dia meu povo!!! ");
		System.out.println("Entre com o sua aula de l�gica: 1-La�o Condicional, 2-La�o Repeti��o, 3-Vetor, 4-Matrizes");
		aula = ler.nextInt();
		
		while(aula != 17) {
			
			if(aula==1)
			{
				System.out.println("\nLa�o Condicional!!! ");
			}
			if(aula==2)
			{
				System.out.println("\nLa�os de Repeti��o!!! ");
				System.out.println("\nAs estruturas de repeti��o tamb�m s�o conhecidas como la�os (loops)");
				System.out.println("e s�o utilizados para executar, repetidamente,");
				System.out.println("uma instru��o ou bloco de instru��o enquanto determinada");
				System.out.println("condi��o estiver sendo satisfeita.");
				
				System.out.println("\nLa�o For:");
				System.out.println("Utilizaremos um valor inteiro(int), para atribuir valores em variaveis para exemplos.");
				System.out.println("Na primeira linha definimos o la�o for, onde na primeira chamada da vari�vel de incremento x, definimos de onde o la�o vai partir, no caso 1.");
				System.out.println("Na segunda chamada de x, definimos at� onde ele vai repetir, no caso at� chegar no valor de 10, utilizando operador relacional <=");
				System.out.println("Na terceira chamada de x, incrementamos seu passo, para a cada passada do la�o incrementar um valor a mais pra x, no caso utilizamos o x++, que � o mesmo que x = x + 1");
				System.out.println("Dentro do bloco do for vamos dar um System.out.printf para cada passagem no la�o ele imprimir o valor de x.");
				System.out.println("Na �ltima instru��o do bloco pegamos o valor de x e vamos atribuindo a vari�vel soma, para cada passada do la�o ele ir somando os valores de x");
				System.out.println("logo ap�s a finaliza��o do la�o � chamado um System.out.printf para mostrar o resultado da soma dentro do la�o.");
				
				int x, soma = 0;

				for(x = 1; x <= 10; x++) {
					System.out.printf("\n %d", x);
					soma += x;
				}
				System.out.printf("\nSoma total: %d", soma);
				
				
			}
			if(aula==3)
			{
				System.out.println("\nVetor!!! ");
			}
			if(aula==4)
			{
				System.out.println("\nMatriz!!! ");
			}
			System.out.println("\nPara Assistir outra aula, entre com outras op��o abaixo:");
			System.out.println("\nEntre com o sua aula de l�gica: 1-La�o Condicional, 2-La�o Repeti��o, 3-Vetor, 4-Matrizes");
			aula = ler.nextInt();
		}
		
	
		
	}
}
