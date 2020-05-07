package com.leonardo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisaoTeste {

	Divisao teste = new Divisao();
	//Caso de teste 1
	@Test
	public void testDivisao() {
		//Declarando variáveis para o caso de teste
		int retornofeito = teste.divisao(50, 2);
		int retornoesperado = 25;
		
		//Método assert 
		assertEquals(retornoesperado,retornofeito);
		//fail("Not yet implemented");
	}
	
	//Caso de teste 2
	@Test
	public void testDivisao2() {
		//Declarando variáveis para o caso de teste
		int retornofeito = teste.divisao(40, 2);
		int retornoesperado = 20;
		
		//Método assert
		assertEquals(retornoesperado,retornofeito);
		//fail("Not yet implemented");
	}

}
