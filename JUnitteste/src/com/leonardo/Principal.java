/*Faculdade Senac
 * Analise e Desenvolvimento de Sistemas
 * Professor: Leonardo Pereira - 06/05/2020
 * Programa para Introdu��o ao Teste Unit�rio com JUnit
 * Neste exemplo foram criado dois Test Case para as Classes Divis�o e Soma.
 * Por fim, criado um Teste Suite
 */

package com.leonardo;

public class Principal {

	public static void main(String[] args) {
		
		//Cirado objetos 
		Divisao div = new Divisao();
		Soma som = new Soma();
		
		//Atribuindo valores para opera��es aritim�ticas
		int num1 = 100;
		int num2 = 50;
		
		//Invoca��o dos m�todos e exibi��o dos resultados
		System.out.printf("Divis�o = %d", div.divisao(num1, num2));
		System.out.printf("%nSoma = %d", som.soma(num1, num2));
	}
}
