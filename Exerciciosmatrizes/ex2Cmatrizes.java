package Exerciciosmatrizes;

public class ex2Cmatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        double[][] matriz = new double[3][3];

		        matriz[0][0] = 1.9;
		        matriz[0][1] = 2.5; 
		        matriz[0][2] = 10.0;
		        matriz[1][0] = 1.0; 
		        matriz[1][1] = 7.8;
		        matriz[1][2] = 2.5;
		        matriz[2][0] = 3.5;
		        matriz[2][1] = 2.2; 
		        matriz[2][2] = 4.7;

		        for(int lin = 0; lin < 3; lin++){
		            for(int col = 0; col < 3; col++) {
		                System.out.print(" " + matriz[lin][col]);
		            }
		            System.out.println();
		        }
		    }
		}

	


