/*Faculdade Senac
 * Analise e Desenvolvimento de Sistemas
 * Professor: Leonardo Pereira - 06/05/2020
 * Programa para Introdução ao Teste Unitário com JUnit
 * Neste exemplo foram criado dois Test Case para as Classes Divisão e Soma.
 * Por fim, criado um Teste Suite
 */

package com.leonardo;

public class Principal {

	public static void main(String[] args) {
		
		//Cirado objetos 
		Divisao div = new Divisao();
		Soma som = new Soma();
		
		//Atribuindo valores para operações aritiméticas
		int num1 = 100;
		int num2 = 50;
		
		//Invocação dos métodos e exibição dos resultados
		System.out.printf("Divisão = %d", div.divisao(num1, num2));
		System.out.printf("%nSoma = %d", som.soma(num1, num2));
	}
}
