package src;
import java.util.Stack;
import java.util.Scanner;
	 
public class Fatorial {
	private static Scanner scan;

	/**
	Fatorial de N utilizando o conceito de pilha
	*@author Gustavo Paiva
	*@param N Inteiro
	**/

static void Fatorialx(int N){
	
	 Stack <Integer> Pilha = new Stack<Integer>();
	 int Fatorial = 1, Aux = N;
	 
	 //Empilha
	 
	 while(Aux > 1)
		 
	 Pilha.push(Aux--); //Empilha e Depois Decrementa
	 
	 while(!Pilha.empty()) //Enquanto há Elementos na Pilha
		 
	 Fatorial *= Pilha.pop(); //Desempilha e calcula o Fatorial

	 System.out.println("O Fatorial de " + N + " é: " + Fatorial);

}

	public static Scanner getScan() {
		return scan;
	}
	public static void setScan(Scanner scan) {
		Fatorial.scan = scan;
		}
}