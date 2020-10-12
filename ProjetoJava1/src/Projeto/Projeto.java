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
		
		if(aula==1)
		{
			System.out.println("\nLaço Condicional!!! ");
		}
		if(aula==2)
		{
			System.out.println("\nLaço de Repetição!!! ");
		}
		if(aula==3)
		{
			System.out.println("\nVetor!!! ");
		}
		if(aula==4)
		{
			System.out.println("\nMatriz!!! ");
		}
	
		
	}
}
