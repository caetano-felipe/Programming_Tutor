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
		
		if(aula==1)
		{
			System.out.println("\nLa�o Condicional!!! ");
		}
		if(aula==2)
		{
			System.out.println("\nLa�o de Repeti��o!!! ");
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
