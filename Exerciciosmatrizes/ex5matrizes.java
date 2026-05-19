package Exerciciosmatrizes;

import java.util.Scanner;

public class ex5matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner receba = new Scanner(System.in);

	        int linhas = 4;
	        int colunas = 3;

	        int[][] matriz = new int[linhas][colunas];

	    
	        System.out.println("Digite os elementos da matriz 4x3:");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
	                matriz[i][j] = receba.nextInt();
	            }
	        }
	 
	    
	        System.out.print("Digite um novo valor para pesquisar na matriz: ");
	        int valorPesquisa = receba.nextInt();

	        boolean encontrado = false;

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                if (matriz[i][j] == valorPesquisa) {
	                    encontrado = true;
	                    break; 
	                }
	            }
	            if (encontrado) {
	                break; 
	            }
	        }

	        if (encontrado) {
	            System.out.println("O valor se encontra na matriz");
	        } else {
	            System.out.println("O valor NÃO se encontra na matriz");
	        }
	 
	        receba.close();
	    }
	

}
