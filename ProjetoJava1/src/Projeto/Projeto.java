package Projeto;

import java.util.Scanner;

public class Projeto {
	public static void main (String args[])
	{
		int aula,lc,lr,v,m;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nBom dia meu povo!!! ");
		System.out.println("Entre com o sua aula de lógica: 1-Laço Condicional, 2-Laço Repetição, 3-Vetor, 4-Matrizes");
		aula = ler.nextInt();
		
		while(aula != 17) {
			
			if(aula==1)
			{
				System.out.println("\nLaço Condicional!!! ");
			}
			if(aula==2)
			{
				System.out.println("\nLaços de Repetição!!! ");
				System.out.println("\nAs estruturas de repetição também são conhecidas como laços (loops)");
				System.out.println("e são utilizados para executar, repetidamente,");
				System.out.println("uma instrução ou bloco de instrução enquanto determinada");
				System.out.println("condição estiver sendo satisfeita.");
				
				System.out.println("\nLaço For:");
				System.out.println("Utilizaremos um valor inteiro(int), para atribuir valores em variaveis para exemplos.");
				System.out.println("Na primeira linha definimos o laço for, onde na primeira chamada da variável de incremento x, definimos de onde o laço vai partir, no caso 1.");
				System.out.println("Na segunda chamada de x, definimos até onde ele vai repetir, no caso até chegar no valor de 10, utilizando operador relacional <=");
				System.out.println("Na terceira chamada de x, incrementamos seu passo, para a cada passada do laço incrementar um valor a mais pra x, no caso utilizamos o x++, que é o mesmo que x = x + 1");
				System.out.println("Dentro do bloco do for vamos dar um System.out.printf para cada passagem no laço ele imprimir o valor de x.");
				System.out.println("Na última instrução do bloco pegamos o valor de x e vamos atribuindo a variável soma, para cada passada do laço ele ir somando os valores de x");
				System.out.println("logo após a finalização do laço é chamado um System.out.printf para mostrar o resultado da soma dentro do laço.");
				
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
			System.out.println("\nPara Assistir outra aula, entre com outras opção abaixo:");
			System.out.println("\nEntre com o sua aula de lógica: 1-Laço Condicional, 2-Laço Repetição, 3-Vetor, 4-Matrizes");
			aula = ler.nextInt();
		}
		
	
		
	}
}
