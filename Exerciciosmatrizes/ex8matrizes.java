package Exerciciosmatrizes;
import java.util.Scanner;
public class ex8matrizes {
     
      

  		    public static void main(String[] args) {
  		      
  		        Scanner receba = new Scanner(System.in);

  		        int linhas = 3;
  		        int colunas = 3;

  		        int[][] matriz1 = new int[linhas][colunas];
  		        int[][] matriz2 = new int[linhas][colunas];

  		     
  		        System.out.println("Digite os valores da matriz 1:");
  		        for (int i = 0; i < linhas; i++) {
  		            for (int j = 0; j < colunas; j++) {
  		                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
  		      
  		                matriz1[i][j] = receba.nextInt(); 
  		            }
  		        }

  		     
  		        for (int i = 0; i < linhas; i++) {
  		            for (int j = 0; j < colunas; j++) {
  		         
  		                matriz2[i][j] = matriz1[j][i];
  		            }
  		        }

  		    
  		        System.out.println("Matriz 2 (Invertida):");
  		        for (int i = 0; i < linhas; i++) {
  		            for (int j = 0; j < colunas; j++) {
  		                System.out.print(matriz2[i][j] + " ");
  		            }
  		            System.out.println(); 
  		        }

  		        receba.close();
  		    }
  		}

  		
  		
  		
  		
  		