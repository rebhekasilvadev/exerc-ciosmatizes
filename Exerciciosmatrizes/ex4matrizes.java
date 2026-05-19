package Exerciciosmatrizes;

import java.util.Scanner;

public class ex4matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);
	  int[][] matriz = new int[5][5];
	  int somaImpares = 0;

		    
		        System.out.println("Digite os elementos da matriz 5x5:");
		        for (int i = 0; i < 5; i++) {
		        for (int j = 0; j < 5; j++) {
		        System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
		        matriz[i][j] = receba.nextInt();
		                
		        
		          if (matriz[i][j] % 2 != 0) {
		          somaImpares += matriz[i][j];
		                }
		            }
		        }

		        System.out.println("RESULTADOS");

		 
		        System.out.println("a) Soma dos números ímpares: " + somaImpares);
		        System.out.println();

		   
		        System.out.println("c) Soma de cada uma das linhas:");
		        for (int i = 0; i < 5; i++) {
		        int somaLinha = 0;
		        for (int j = 0; j < 5; j++) {
		        somaLinha += matriz[i][j];
		            }
		        System.out.println("   Soma da Linha " + (i + 1) + " = " + somaLinha);
		        }
		        System.out.println();
		        System.out.println("b) Soma de cada uma das colunas:");
		        for (int j = 0; j < 5; j++) {
		        int somaColuna = 0;
		        for (int i = 0; i < 5; i++) {
		        somaColuna += matriz[i][j]; 
		            }
		            System.out.println("   Soma da Coluna " + (j + 1) + " = " + somaColuna);
		        }

		        receba.close();
		    }	
		
	}


