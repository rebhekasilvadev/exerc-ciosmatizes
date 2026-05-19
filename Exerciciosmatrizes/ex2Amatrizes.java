package Exerciciosmatrizes;

public class ex2Amatrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char[][] matriz = new char[4][5];

		   matriz[0][0] = 'a'; 
		   matriz[0][1] = 'b'; 
		   matriz[0][2] = 'c';
		   matriz[0][3] = 'd'; 
		   matriz[0][4] = 'e';
		   matriz[1][0] = 'f'; 
		   matriz[1][1] = 'g'; 
		   matriz[1][2] = 'h'; 
		   matriz[1][3] = 'i'; 
		   matriz[1][4] = 'j';
		   matriz[2][0] = 'l';
		   matriz[2][1] = 'm';
		   matriz[2][2] = 'n';
		   matriz[2][3] = 'o'; 
		   matriz[2][4] = 'p';
		   matriz[3][0] = 'q'; 
		   matriz[3][1] = 'r';
		   matriz[3][2] = 's'; 
		   matriz[3][3] = 't';
		   matriz[3][4] = 'u';

		        for(int lin = 0; lin < 4; lin++){
		            for(int col = 0; col < 5; col++) {
		                System.out.print(" " + matriz[lin][col]);
		            }
		            System.out.println();
		        }
		    }
		}

	


