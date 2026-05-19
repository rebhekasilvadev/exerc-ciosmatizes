package Exerciciosmatrizes;

import java.util.Scanner;

public class ex9matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner receba = new Scanner(System.in);

		      
		        int linhas = 5;
		        int colunas = 2;

		        int[][] matriz1 = new int[linhas][colunas];
		        int[][] matriz2 = new int[linhas][colunas];
		        int[][] matriz3 = new int[linhas][colunas];

	
		        System.out.println("Digite os valores da Matriz 1:");
		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                System.out.print("Matriz 1 [" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz1[i][j] = receba.nextInt();
		            }
		        }

		        System.out.println("\nDigite os valores da Matriz 2:");
		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                System.out.print("Matriz 2 [" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz2[i][j] = receba.nextInt();
		            }
		        }

		     
		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
		            }
		        }

		       
		        System.out.println("\nMatriz3 (Resultado da Soma):");
		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                System.out.print(matriz3[i][j] + "\t");
		            }
		            System.out.println(); 
		        }

		        receba.close();
		    }
		}

	


