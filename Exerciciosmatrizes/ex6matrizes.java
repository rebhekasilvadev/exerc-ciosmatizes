package Exerciciosmatrizes;

import java.util.Scanner;

public class ex6matrizes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);

        int linhas = 5;
        int colunas = 2;
        int[][] matriz = new int[linhas][colunas];
        
        double somaTotal = 0; 
       
        System.out.println("Digite os elementos da matriz 5x2:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = receba.nextInt();
                
                somaTotal = somaTotal + matriz[i][j];
            }
        }
        int totalElementos = linhas * colunas;
        double media = somaTotal / totalElementos;
        System.out.println("Soma total dos elementos: " + somaTotal);
        System.out.println("Média dos elementos: " + media);
 
        receba.close();		
}
}