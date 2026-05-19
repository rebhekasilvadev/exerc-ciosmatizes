package Exerciciosmatrizes;

import java.util.Scanner;

public class ex1lista5matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		
		String[][] Clientes = new String[5][5];


		Clientes[0][0] = "João Roberto";
		Clientes[0][1] = "Rua das Flores";
		Clientes[0][2] = "Cerejeiras";
		Clientes[0][3] = "123.456.789-00"; 
		Clientes[0][4] = "(11) 98888-7777"; 
		Clientes[1][0] = "Maria Silva";
		Clientes[1][1] = "Avenida dos Anjos, n 01";
		Clientes[1][2] = "Cidade Alta";
		Clientes[1][3] = "222.333.444-55"; 
		Clientes[1][4] = "(21) 97777-6666"; 
		Clientes[2][0] = "Pedro Amaro";
		Clientes[2][1] = "Rua da Liberdade";
		Clientes[2][2] = "Praça 67";
		Clientes[2][3] = "333.444.555-66"; 
		Clientes[2][4] = "(31) 96666-5555"; 
	
		     
		for (int lin = 0; lin < 3; lin++) {
		        	
		        	
		            System.out.print("Nome: ");
		            Clientes[lin][0] = receba.nextLine();
		    
		            System.out.print("Endereço: ");
		            Clientes[lin][1] = receba.nextLine();
		            
		            System.out.print("Bairro: ");
		            Clientes[lin][2] = receba.nextLine();
		            
		            System.out.print("CPF: ");
		            Clientes[lin][3] = receba.nextLine();
		            
		            System.out.print("Telefone: ");
		            Clientes[lin][4] = receba.nextLine();
		            
		            System.out.println("");
		        }

		    
		        System.out.println("LISTA DE CLIENTES");

				for(int lin = 0; lin < 3; lin++) {
				    System.out.println("Nome: " + Clientes[lin][0]);
				    System.out.println("Endereço: " + Clientes[lin][1]);
				    System.out.println("Bairro: " + Clientes[lin][2]);
				    System.out.println("CPF: " + Clientes[lin][3]);
				    System.out.println("Telefone: " + Clientes[lin][4]);
				    System.out.println("");
		        
		        receba.close();
		    }
		

	
	}
	}
	
	
	


