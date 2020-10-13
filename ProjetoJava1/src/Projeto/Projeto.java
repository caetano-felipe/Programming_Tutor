package Projeto;

import java.util.Scanner;

public class Projeto {
	
	public static void main (String args[]) throws InterruptedException
	{
		int aula, cond = 0, rep = 0, x1 = 0;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Aguarde o anfitrião para iniciar esta reunião");
		Thread.sleep(2000);
		System.out.println("Esta é uma reunião recorrente");
		Thread.sleep(3000);
		System.out.println("Sala Pessoal do 'Luis Roberto'");
		Thread.sleep(2000);
		
		System.out.println("\nBom dia meu povo!!! ");
		Thread.sleep(1500);
		System.out.println("Minha gente, hoje vamos fazer uma mini revisão sobre o que vimos em Java, antes de irmos para POO.");
		Thread.sleep(3000);
		System.out.println("Com quem eu estou falando?");
		nome = ler.nextLine();
		System.out.printf("\nBom, vou deixar você escolher o que você quer ver primeiro, %s", nome);
		Thread.sleep(3000);
		System.out.println("\nEscolha um número correspondente a matéria: \n(1)Laço Condicional\n(2)Laço Repetição\n(3)Vetor\n(4)Matrizes\n(0)Sair da aula");
		aula = ler.nextInt();
		
		while(aula != 0) {
			
			if(aula == 1) {
				System.out.println("\nBom, sobre Laço Condicional, vamos fazer uma explicação interativa: ");
				Thread.sleep(1500);
				System.out.println(nome + ", o laço condicional testa se uma condição é verdadeira, para assim executar uma instrução.\nCaso não seja verdadeira não será executada. ");
				Thread.sleep(3500);
				System.out.println("Temos dois tipos de laço: (1)Simples e (2)Composto. \nQual deles você gostaria de revisar: ");
				cond = ler.nextInt();
				switch(cond) {
				case 1:
					Thread.sleep(2000);
					System.out.printf("Quando queremos utilizar um laço condicional em Java, utilizamos o comando if (se).\nPor exemplo: ");
					Thread.sleep(1500);
					System.out.printf("\nif(hora >= 8 && hora <= 17)");
					Thread.sleep(1500);
					System.out.printf("\n{");
					Thread.sleep(1500);
					System.out.printf("\n  System.out.println(''Horário de aula'');\n}");
					Thread.sleep(1500);
					System.out.println("\nAgora é sua vez. Digite uma hora entre 8 e 17: ");
					double hora = ler.nextDouble();
					
					while(hora < 8 || hora > 17) {
						System.out.println("\nNúmero inválido... Digite uma hora entre 8 e 17: ");
						hora = ler.nextDouble();
					}
					
					if(hora >= 8 && hora <= 17)	{
						Thread.sleep(1500);
						System.out.println(hora + " horas é hora de ligar a webcam.");
						Thread.sleep(1500);
						System.out.println("Pronto esse é laço simples!");
						Thread.sleep(1500);
					}
					break;
				case 2:
					System.out.printf("Além do if(se), que é usado no laço simples,usamos o else(senão).\nUsamos ele para executar uma instrução caso a condição seja falsa.");
					Thread.sleep(2000);
					System.out.println("\nPor exemplo: ");
					Thread.sleep(2000);
					System.out.println("if(hora >= 8 && hora <= 17)");
					Thread.sleep(2000);
					System.out.println("{");
					Thread.sleep(2000);
					System.out.println("  System.out.println(''Horário de aula'');\n}");
					Thread.sleep(2000);
					System.out.println("else if(hora>6 && hora<8)");
					Thread.sleep(2000);
					System.out.println("{");
					Thread.sleep(2000);
					System.out.println("  System.out.println(''Daqui a pouco começa a aula...'');");
					Thread.sleep(2000);
					System.out.printf("}");
					Thread.sleep(2000);
					System.out.println("else if(hora>17 && hora<=24)");
					Thread.sleep(2000);
					System.out.println("{");
					Thread.sleep(2000);
					System.out.println("  System.out.println(''Já fez o BARÔMETRO???'');");
					Thread.sleep(2000);
					System.out.println("}");
					Thread.sleep(2000);
					System.out.println("else");
					Thread.sleep(2000);
					System.out.println("{");
					Thread.sleep(2000);
					System.out.println("  System.out.println(''Deveria estar dormindo!!'');");
					Thread.sleep(2000);
					System.out.println("}");
					Thread.sleep(2000);
					System.out.println("\nAgora é sua vez. Digite uma hora: ");
					hora = ler.nextDouble();
					
					if(hora >= 8 && hora <= 17)	{
						Thread.sleep(2000);
					  System.out.println("Presta atenção nos conselhos do Vagnão!");
					  Thread.sleep(1500);
					}
					else if(hora > 6 && hora < 8) {
						Thread.sleep(2000);
					  System.out.println("Daqui a pouco começa a aula...");
					  Thread.sleep(1500);
					}
					else if(hora > 17 && hora <= 24) {
						Thread.sleep(2000);
					  System.out.println("Já fez o BARÔMETRO???");
					  Thread.sleep(1500);
					} else {
						Thread.sleep(2000);
					  System.out.println("Deveria estar dormindo...ZzzzZ!!");
					  Thread.sleep(1500);
					}
					break;
					default:
						Thread.sleep(2000);
						System.out.printf("Hmm, achou que não íamos ver você tentando burlar o sistema né?\nTente 1 para laço condicional simples e 2 para composto");
						Thread.sleep(1500);
					break;
				}
			}
			if(aula == 2) {
				System.out.println("\nBom, sobre o Laço de Repetição, vamos fazer uma explicação interativa: ");
				Thread.sleep(2000);
				System.out.println(nome + ", os laços de repetição, também são conhecidos como laços(loops) e são utilizados para executar um bloco de instruções, repetidamente");
				Thread.sleep(2000);
				System.out.println("Temos três tipos de laços: (1)for, (2)while e (3)do while. \nQual deles você gostaria de revisar: ");
				rep = ler.nextInt();
				switch(rep)	{
					case 1:
					Thread.sleep(2000);
					System.out.println("FOR");
					Thread.sleep(2000);
					System.out.printf("Quando queremos utilizar um laço de repetição em Java, utilizamos o comando for(para).\nPor exemplo:");
					Thread.sleep(2000);
					System.out.println("\nLaço For:");
					Thread.sleep(2000);
					System.out.println("int x, soma = 0;");
					Thread.sleep(2000);
					System.out.println("for(x = 1; x <= 5; x++) {");
					Thread.sleep(2000);
					System.out.println("  System.out.printf(\"\\n %d\", x);");
					Thread.sleep(2000);
					System.out.println("  soma += x;");
					Thread.sleep(2000);
					System.out.println("}");
					Thread.sleep(2000);
					System.out.println("System.out.printf(\"\\nSoma total: %d\", soma);");
						
					int x, soma = 0;
	
					for(x = 1; x <= 5; x++) {
						Thread.sleep(1500);
						System.out.printf("\n %d", x);
						soma += x;
					}
					Thread.sleep(1500);
					System.out.printf("\nSoma total: %d", soma);
					
				
				break;
				case 2:
					Thread.sleep(2000);
					System.out.println("WHILE");
					Thread.sleep(2000);
					System.out.printf("Quando queremos utilizar um laço de repetição em Java, utilizamos o comando while(enquanto),");
					Thread.sleep(2000);
					System.out.println("\nque é utilizado para construir uma estrutura de repetição que executa o bloco de código.");
                    Thread.sleep(2000);
                    System.out.println("Por exemplo: ");
                    Thread.sleep(2000);
					System.out.println("\nSystem.out.printf(''Digite um número de 1 a 5: '')");
					Thread.sleep(2000);
					System.out.println("x1 = ler.nextInt();");
					Thread.sleep(2000);
					System.out.println("while(x1 <= 5) {");
					Thread.sleep(2000);
					System.out.println("  System.out.printf(''Contador: %d'', x1);");
					Thread.sleep(2000);
					System.out.println("  x1++;");
					Thread.sleep(2000);
					System.out.println("}");
					Thread.sleep(2000);
					System.out.println("System.out.printf(\"\\nPrograma finalizado...\");");
					Thread.sleep(2000);
					System.out.printf("\nAgora é sua vez! Digite um número de 1 a 5: ");
					x1 = ler.nextInt();
					
					while(x1 < 1|| x1 > 5) {
						System.out.println("Espertinho...Querendo burlar o sistema!");
						System.out.printf("\nDigite novamente um número de 1 a 5: ");
						x1 = ler.nextInt();
					}
					
					while(x1 <= 5) {
						Thread.sleep(2000);
						System.out.printf("\nContador: %d", x1);
						x1++;
					}
					Thread.sleep(2000);
					System.out.printf("\nPrograma finalizado...");
					Thread.sleep(1500);
					
					break;
				case 3:
					Thread.sleep(2000);
					System.out.println("DO WHILE");
					Thread.sleep(2000);
					System.out.printf("O Do While tem quase o mesmo funcionamento que o while,"); 
					Thread.sleep(2000);
					System.out.println("\na diferença é que com o uso dele teremos os comandos executados ao menos uma única vez..");
					Thread.sleep(2000);
					System.out.println("\nPor exemplo: ");
					Thread.sleep(2000);
					System.out.println("");
					Thread.sleep(2000);
					System.out.println("entre com uma variável contadora: int y1 = 0;");
					Thread.sleep(2000);
					System.out.println("do {");
					Thread.sleep(2000);
					System.out.println(" System.out.printf(\"\\nContador: %d\", y1);");
					Thread.sleep(2000);
					System.out.println(" y1++;");
					Thread.sleep(2000);
					System.out.println("}while(y1 <= 5);");
					Thread.sleep(2000);
					System.out.println("System.out.printf(\"\\nPrograma finalizado...\");");
					int y1 = 0;
					
					do {
						Thread.sleep(2000);
						System.out.printf("\nContador: %d", y1);
						y1++;
					}while(y1 <= 5);
					
					Thread.sleep(2000);					
					System.out.printf("\nPrograma finalizado...");
					Thread.sleep(1500);
			
					break;
					}
			}
			if(aula == 3){
				int[] array1 = {1, 6, 8, 19, 7, 9};
				int[] array2 = {2, 3, 5, 6, 10};
				int soma = 0;
				float[] nota = new float[5];
				Thread.sleep(2000);
				System.out.println("Array!");
				Thread.sleep(2000);
				System.out.println("\nArray é uma estrutura de dados que armazena uma coleção de elementos de tal forma que cada um dos elementos\npossa ser identificado por, pelo menos, um índice ou uma chave.");
				Thread.sleep(2000);
				System.out.println("Declarando primeira variável: int[] array1 = {1, 6, 8, 19, 7, 9};");
				Thread.sleep(3000);
				System.out.println("Declarando segunda variável: int[] array2 = {2, 3, 5, 6, 10};");
				Thread.sleep(3000);
				System.out.println("Para alterar um índice de um array: array1[1] = 66");
				Thread.sleep(2000);

				array1[1] = 66;

				System.out.println("Para mostrar os valores do array1, já com o primeiro índice alterado!");
				Thread.sleep(2000);
				System.out.println("\nfor(int i : array1) {");
				Thread.sleep(2000);
				System.out.println("  System.out.printf(\"\\nValor: %d\", i);");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);

				for(int i : array1) {
					Thread.sleep(2000);
					System.out.printf("\nValor: %d", i);
				}
				Thread.sleep(2000);

				System.out.println("\nVamos agora fazer uma operação matemática simples com array:");
				Thread.sleep(2000);
				System.out.println("soma = array1[2] + array2[3]");
				Thread.sleep(2000);
				System.out.println("o resultado vai ser 14!");
				Thread.sleep(2000);

				soma = array1[2] + array2[3];
				System.out.printf("\nSoma: %d", soma);
				Thread.sleep(2000);

				System.out.println("\nVerificando tamanho de arrays:");
				Thread.sleep(2000);
				System.out.println("if(array2.length >= 5) {");
				Thread.sleep(2000);
				System.out.println("  System.out.println(\"Tamanho do Array2 - Maior que 5!\");");
				Thread.sleep(2000);
				System.out.println("} else {");
				Thread.sleep(2000);
				System.out.println("  System.out.println(\"Tamanho do Array2 - Menor ou igual a 5!\");");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);
				
				if(array2.length >= 5) {
					System.out.println("Tamanho do Array2 - Maior que 5!");
					Thread.sleep(1500);
				} else {
					System.out.println("Tamanho do Array2 - Menor ou igual a 5!");
					Thread.sleep(1500);
				}
				Thread.sleep(1000);

				System.out.println("Visualizando o tamanho de um array:");
				Thread.sleep(2000);
				System.out.println("Vamos dar um print com System.out.printf(\"Tamanho do ArrayUm: %d %n\", array1.length);");
				Thread.sleep(2000);
				System.out.printf("\nTamanho do ArrayUm: %d %n", array1.length);
				Thread.sleep(2000);
				System.out.println("Populando um array:");
				Thread.sleep(2000);
				System.out.println("for(int i = 0; i < 5; i++) {");
				Thread.sleep(2000);
				System.out.println("  System.out.println(\"Entre com uma nota: \");");
				Thread.sleep(2000);
				System.out.println("  nota[i] = ler.nextFloat();");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);

				for(int i = 0; i < 5; i++) {
					System.out.println("Entre com uma nota: ");
					nota[i] = ler.nextFloat();
				}
				Thread.sleep(2000);

				System.out.println("Mostrando os valores do array populado:");
				Thread.sleep(2000);
				System.out.println("for(int i = 0; i < 5; i++) {");
				Thread.sleep(2000);
				System.out.println("  System.out.printf(\"\\nNota %d: %.1f\", (i + 1), nota[i]);");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);

				for(int i = 0; i < 5; i++) {
					Thread.sleep(2000);
					System.out.printf("\nNota %d: %.1f", (i + 1), nota[i]);
				}
			}
			if(aula == 4) {
				System.out.println("MATRIZ");
				Thread.sleep(2000);
				System.out.println("Quando queremos armazenar uma grande quantidade de valores, podemos utilizar arrays.");
				Thread.sleep(2000);
				System.out.println("Vamos ver um exemplo: \n");
				Thread.sleep(2000);
				System.out.println("int M[][] = new int[2][2];");
				Thread.sleep(2000);
				System.out.println("int i, j, qtd=0;");
				Thread.sleep(2000);
				System.out.println("for (i=0; i<2; i++) {");
				Thread.sleep(2000);
				System.out.println("  for (j=0; j<2; j++) {");
				Thread.sleep(2000);
				System.out.println("     System.out.print(''Digite um valor: '');");
				Thread.sleep(2000);
				System.out.println("     M[i][j] = ler.nextInt();");
				Thread.sleep(2000);
				System.out.println("     if( M[i][j] > 10) {");
				Thread.sleep(2000);
				System.out.println("        qtd++");
				Thread.sleep(2000);
				System.out.println("     }");
				Thread.sleep(2000);
				System.out.println("   }");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);
				System.out.println("Essa é a sintaxe básica de matriz. Para mostrá-la: ");
				Thread.sleep(2000);
				System.out.println("for(i=0;i<2;i++) {");
				Thread.sleep(2000);
				System.out.println("  for(j=0; j<2; j++) {");
				Thread.sleep(2000);
				System.out.println("     System.out.printf(''['' + M[i][j] + '']'')");
				Thread.sleep(2000);
				System.out.println("  }");
				Thread.sleep(2000);
				System.out.println("  System.out.println();");
				Thread.sleep(2000);
				System.out.println("}");
				Thread.sleep(2000);
				System.out.println("\nAgora é sua vez. ");
				Thread.sleep(2000);
				
				int M[][] = new int[2][2];
				int i, j, qtd=0;
				
				for (i=0; i<2; i++) {
					for (j=0; j<2; j++) {
						System.out.print("Digite um valor: ");
						M[i][j] = ler.nextInt();
						if( M[i][j] > 10)
						{
							qtd++;
						}
					}
				}
				for(i=0;i<2;i++){
					for(j=0; j<2; j++){
						System.out.printf("[ " + M[i][j] + " ]");
					}
					System.out.println();
				}
				Thread.sleep(2000);
				System.out.println("\nA matriz possui " + qtd + " valore(s) maiores que 10.");
			}
			System.out.println("\nPara assistir outra aula, entre com outra opção abaixo:");
			System.out.println("\nEscolha um número correspondente a matéria: \n(1)Laço Condicional\n(2)Laço Repetição\n(3)Vetor\n(4)Matrizes\n(0)Sair da aula");
			aula = ler.nextInt();
			
			if(aula == 0) {
				System.out.println("Revisão finalizada! Agora é com você Vagnãooo!!!");
			} else {
				System.out.println("\nCom quem eu estou falando agora?");
				nome = ler.next();
			}
		}
	}
}
