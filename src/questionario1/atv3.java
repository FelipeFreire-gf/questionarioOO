package questionario1;

/*
 Crie um programa em Java no qual o usuário deve entrar com a operação a ser realizada (soma '+', subtração '-' ou multiplicação '*')
 e dois números inteiros. O programa deverá utilizar o comando switch para escolher entre as operações e mostrar o resultado da operação.

Saída esperada 1:

Entre com a operação a ser realizada (+, - ou *):

Entre com o primeiro número:

Entre com o segundo número:

O resultado da operação é: <RESULTADO>

Saída esperada 2:

Entre com a operação a ser realizada (+, - ou *):

Entre com o primeiro número:

Entre com o segundo número:

Operação inválida
 */

import java.util.Scanner;

public class atv3 {
	
	public static void main(String[] args) {
		
		char operacao;
		int primeiroNumero;
		int segundoNumero;
		int resultado;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a operação a ser realizada (+, - ou *):");
		operacao = scan.next().charAt(0);
		System.out.println("Entre com o primeiro número:");
		primeiroNumero = scan.nextInt();
		System.out.println("Entre com o segundo número:");
		segundoNumero = scan.nextInt();
		
		switch(operacao) {
		
		case '+': resultado = (primeiroNumero + segundoNumero);
			System.out.println("O resultado da operação é: "+resultado);
				break;
		case '-': resultado = (primeiroNumero - segundoNumero);
			System.out.println("O resultado da operação é: "+resultado);
				break;
		case '*': resultado = (primeiroNumero * segundoNumero);
			System.out.println("O resultado da operação é: "+resultado);
				break;
			default: System.out.println("Operação Inválida");
				break;
		}
		
	}

}
