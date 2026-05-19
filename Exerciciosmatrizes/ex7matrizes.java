package Exerciciosmatrizes;

import java.util.Scanner;

public class ex7matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		       Scanner receba = new Scanner(System.in);

		        int linhas = 6;
		        int colunas = 3;
		        int[][] matriz = new int[linhas][colunas];
		        
		        int maior = 0;
		        int menor = 0;

		        System.out.println("Digite os elementos da matriz 6x3:");
		        for (int i = 0; i < linhas; i++) {
		            for (int j = 0; j < colunas; j++) {
		                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz[i][j] = receba.nextInt();
		                
		         
		                if (i == 0 && j == 0) {
		                    maior = matriz[i][j];
		                    menor = matriz[i][j];
		                } else {
		             
		                    if (matriz[i][j] > maior) {
		                        maior = matriz[i][j];
		                    }
		             
		                    if (matriz[i][j] < menor) {
		                        menor = matriz[i][j];
		                    }
		                }
		            }
		        }
		 

		        System.out.println("\nMaior elemento existente na matriz: " + maior);
		        System.out.println("Menor elemento existente na matriz: " + menor);
		 
		        receba.close();
		    }
		

		
		
	}


