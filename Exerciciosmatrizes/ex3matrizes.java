package Exerciciosmatrizes;

import java.util.Scanner;

public class ex3matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner receba = new Scanner(System.in);
		        int[][] matriz = new int[3][3];

		     
		        System.out.println("Digite os elementos da matriz 3x3:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
		                matriz[i][j] = receba.nextInt();
		            }
		        }

		        System.out.println("Resultados:");
		        for (int i = 0; i < 3; i++) {
		            int somaLinha = 0;
		            for (int j = 0; j < 3; j++) {
		                somaLinha += matriz[i][j];
		            }
		            System.out.println("Soma Linha " + (i + 1) + " = " + somaLinha);
		        }

		        receba.close();
		    }
		
	}


