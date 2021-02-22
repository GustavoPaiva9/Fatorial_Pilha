package src;

import java.util.Scanner;

public class Main_Fatorial extends Fatorial {
	/**
	 * @author Gustavo Paiva
	 */
	
	public static void main (String[] args){
            int N=1;
            setScan(new Scanner (System.in));
	    System.out.print("Digite um Número: "); 
	    N = getScan().nextInt();
	    Fatorialx(N);
	    
	  }
}