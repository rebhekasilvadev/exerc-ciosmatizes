package Exerciciosmatrizes;

public class ex2Bmatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int[][] matriz = new int[3][4];

		        matriz[0][0] = 19; 
		        matriz[0][1] = 25; 
		        matriz[0][2] = 100; 
		        matriz[0][3] = 99;
		        matriz[1][0] = 10; 
		        matriz[1][1] = 7;  
		        matriz[1][2] = 25; 
		        matriz[1][3] = 14;
		        matriz[2][0] = 35;
		        matriz[2][1] = 2; 
		        matriz[2][2] = 47; 
		        matriz[2][3] = 74;

		        for(int lin = 0; lin < 3; lin++){
		            for(int col = 0; col < 4; col++) {
		                System.out.print(" " + matriz[lin][col]);
		            }
		            System.out.println();
		        }}}
		    