package Exerciciosmatrizes;

import java.util.Scanner;

public class ex10matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		        Scanner receba = new Scanner(System.in);

		        int tamanho = 5; 
		        int[][] matriz = new int[tamanho][tamanho];
		        int somaDiagonal = 0;

		    
		        System.out.println("Digite os elementos da matriz 5x5:");
		        for (int i = 0; i < tamanho; i++) {
		            for (int j = 0; j < tamanho; j++) {
		                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz[i][j] = receba.nextInt();
		            }
		        }
		 
		      
		        for (int i = 0; i < tamanho; i++) {
		            somaDiagonal = somaDiagonal + matriz[i][i]; 
		        }

		
		        System.out.println("A soma dos valores da diagonal é: " + somaDiagonal);
		 
		        receba.close();
		    }
		}


