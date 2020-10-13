package Projeto;

import java.util.Scanner;

public class Projeto {
	
	public static void main (String args[]) throws InterruptedException
	{
		int aula, cond=0, rep=0, x1=0;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Aguarde o anfitrião para iniciar esta reunião");
		ler.nextLine();
		System.out.println("Está é uma reunião recorrente");
		ler.nextLine();
		System.out.println("Sala Pessoal do 'Luis Roberto'");
		ler.nextLine();
		
		System.out.println("\nBom dia meu povo!!! ");
		System.out.println("Entre com o sua aula de lógica: 1-Laço Condicional, 2-Laço Repetição, 3-Vetor, 4-Matrizes");
		aula = ler.nextInt();
		
		while(aula != 17) {
			
			if(aula == 1)
			{
				System.out.println("\nBom, sobre Laço Condicional, vamos fazer uma explicação interativa: ");
				System.out.println("Com quem eu estou falando?");
				nome = ler.next();
				System.out.println(nome + ", o laço condicional testa se uma condição é verdadeira, para assim executar uma instrução.\nCaso não seja verdadeira não será executada. ");
				System.out.println("Temos dois tipos de laço: (1)Simples e (2)Composto. \nQual deles você gostaria de revisar: ");
				cond = ler.nextInt();
				switch(cond)
				{
				case 1:
					System.out.printf("Quando queremos utilizar um laço condicional em Java, utilizamos o comando if (se).\nPor exemplo: ");
					System.out.printf("\nif(hora >= 8 && hora <= 17)\n{\n  System.out.println(''Horário de aula'');\n}");
					System.out.println("\nAgora é sua vez. Digite uma hora entre 8 e 17: ");
					double hora = ler.nextDouble();
					
					if(hora >= 8 && hora <= 17)
					{
						System.out.println(hora + " horas é hora de ligar a webcam.\nPronto esse é laço simples!");
					}
					break;
				case 2:
					System.out.printf("Além do if(se), que é usado no laço simples,usamos o else(senão).\nUsamos ele para executar uma instrução caso a condição seja falsa.\nPor exemplo: \nif(hora >= 8 && hora <= 17)\n{\n  System.out.println(''Horário de aula'');\n}");
					System.out.printf("\nelse if(hora>6 && hora<8)\n{\n  System.out.println(''Daqui a pouco começa a aula...'');\n}\nelse if(hora>17 && hora<=24)\n{\n  System.out.println(''Já fez o BARÔMETRO???'');\n}\nelse\n{\n  System.out.println(''Deveria estar dormindo!!'');\n}");
					System.out.println("\nAgora é sua vez. Digite uma hora: ");
					hora = ler.nextDouble();
					
					if(hora >= 8 && hora <= 17)
					{
					  System.out.println("Presta atenção nos conselhos do Vagnão!");
					}
					else if(hora > 6 && hora < 8)
					{
					  System.out.println("Daqui a pouco começa a aula...");
					}
					else if(hora > 17 && hora <= 24)
					{
					  System.out.println("Já fez o BARÔMETRO???");
					}
					else
					{
					  System.out.println("Deveria estar dormindo!!");
					}
					break;
					default:
						System.out.printf("Hmm, achou que não íamos ver você tentando burlar o sistema né?\nTente 1 para laço condicional simples e 2 para composto");
					break;
				}
			}
			if(aula == 2)
			{
				System.out.println("\nBom, sobre Laço Repetição, vamos fazer uma explicação interativa: ");
				System.out.println("Com quem eu estou falando?");
				nome = ler.next();
				System.out.println(nome + ", o laço de repetição também são conhecidas como laços (loops) e são utilizados para executar, repetidamente");
				System.out.println("Temos três tipos de laço: (1)for, (2)while e (3)do while. \nQual deles você gostaria de revisar: ");
				rep = ler.nextInt();
				switch(rep)
					{
					case 1:
					System.out.printf("Quando queremos utilizar um laço de repetição em Java, utilizamos o comando for (para).\nPor exemplo:");
					System.out.println("\nLaço For:");
					System.out.println("int x, soma = 0;");
					System.out.println("for(x = 1; x <= 5; x++) {");
					System.out.println("  System.out.printf(\"\\n %d\", x);");
					System.out.println("  soma += x;");
					System.out.println("}");
					System.out.println("System.out.printf(\"\\nSoma total: %d\", soma);");
						
					int x, soma = 0;
	
					for(x = 1; x <= 5; x++) {
						System.out.printf("\n %d", x);
						soma += x;
					}
					System.out.printf("\nSoma total: %d", soma);
				
				break;
				case 2:
					System.out.printf("Quando queremos utilizar um laço de repetição em Java, utilizamos o comando while(enquanto).\nPor exemplo: ");
					System.out.println("\nint x1 = 3;");
					System.out.println("x1 = ler.nextInt();");
					System.out.println("System.out.printf(\"\\nVocê não tem permissão para entrar\");\");");
					System.out.println("	System.out.printf(\"\\nVocê é de maior...\");");
					System.out.println("x1++;");
					System.out.println("  }");
					System.out.println("System.out.printf(\"\\nPrograma finalizado...\");");
					System.out.printf("\nDigite um número: ");
					 
					x1 = ler.nextInt();
					
					while(x1<5)
					{
						System.out.printf("\nContador: %d", x1);
						x1++;
					}
					System.out.printf("\nPrograma finalizado...");
					
					break;
					
				case 3:
					System.out.printf("Quando queremos utilizar um laço condicional em Java, utilizamos o comando do while (faça enquanto).\nPor exemplo: \n");
					System.out.println("do {");
					System.out.println(" System.out.printf(\"\\nContador: %d\", x1);");
					System.out.println("x1++;");
					System.out.println(" }while(x1<5);");
					System.out.println(" System.out.printf(\"\\nPrograma finalizado...\");");
				
					
					do {
						System.out.printf("\nContador: %d", x1);
						x1++;
					}while(x1<5);
										
					System.out.printf("\nPrograma finalizado...");
			
					break;
					
					}
	
				
			}
			if(aula == 3)
			{
				int[] array1 = {1, 6, 8, 19, 7, 9};
				int[] array2 = {2, 3, 5, 6, 10};
				int soma = 0;
				float[] nota = new float[5];

				System.out.println("Array!");
				System.out.println("\nArray é uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos possa ser identificado por,\n pelo menos, um índice ou uma chave.");
				System.out.println("Para alterar um índice de um array: array1[1] = 66");
				Thread.sleep(4000);

				array1[1] = 66;

				System.out.println("Para mostrar os valores do array1, já com o primeiro índice alterado!");
				System.out.println("\nfor(int i : array1) {");
				System.out.println("  System.out.printf(\"\\nValor: %d\", i);");
				System.out.println("}");
				Thread.sleep(4000);

				for(int i : array1) {
					System.out.printf("\nValor: %d", i);
				}
				Thread.sleep(4000);

				System.out.println("\nVamos agora fazer uma operação matemática simples com array:");
				System.out.println("soma = array1[2] + array2[3]");
				System.out.println("o resultado vai ser 14!");
				Thread.sleep(4000);

				soma = array1[2] + array2[3];
				System.out.printf("\nSoma: %d", soma);
				Thread.sleep(4000);

				System.out.println("\nVerificando tamanho de arrays:");
				System.out.println("if(array2.length >= 5) {");
				System.out.println("  System.out.println(\"Tamanho do Array2 - Maior que 5!\");");
				System.out.println("} else {");
				System.out.println("  System.out.println(\"Tamanho do Array2 - Menor ou igual a 5!\");");
				System.out.println("}");
				Thread.sleep(4000);
				
				if(array2.length >= 5) {
					System.out.println("Tamanho do Array2 - Maior que 5!");
				} else {
					System.out.println("Tamanho do Array2 - Menor ou igual a 5!");
				}
				Thread.sleep(4000);

				System.out.println("Visualizando o tamanho de um array:");
				System.out.println("Vamos dar um print com System.out.printf(\"Tamanho do ArrayUm: %d %n\", array1.length);");
				System.out.printf("\nTamanho do ArrayUm: %d %n", array1.length);
				Thread.sleep(4000);

				System.out.println("Populando um array:");
				System.out.println("for(int i = 0; i < 5; i++) {");
				System.out.println("  System.out.println(\"Entre com uma nota: \");");
				System.out.println("  nota[i] = ler.nextFloat();");
				System.out.println("}");
				Thread.sleep(4000);

				for(int i = 0; i < 5; i++) {
					System.out.println("Entre com uma nota: ");
					nota[i] = ler.nextFloat();
				}
				Thread.sleep(4000);

				System.out.println("Mostrando os valores do array populado:");
				System.out.println("for(int i = 0; i < 5; i++) {");
				System.out.println("  System.out.printf(\"\\nNota %d: %.1f\", (i + 1), nota[i]);");
				System.out.println("}");
				Thread.sleep(4000);

				for(int i = 0; i < 5; i++) {
					System.out.printf("\nNota %d: %.1f", (i + 1), nota[i]);
				}
			}
			if(aula == 4)
			{
				System.out.println("\nMatriz!!! ");
			}
			System.out.println("\nPara Assistir outra aula, entre com outras opção abaixo:");
			System.out.println("\nEntre com o sua aula de lógica: 1-Laço Condicional, 2-Laço Repetição, 3-Vetor, 4-Matrizes");
			aula = ler.nextInt();
		}
		
	}
}
