package com.leonardo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaTeste {

	Soma sum = new Soma();
	
	//Caso de teste 1
	@Test
	public void testSoma() {
		//Declarando vari�veis para o caso de teste
		int retornofeito = sum.soma(50, 2);
		int retornoesperado = 52;
		
		//M�todo assert
		assertEquals(retornoesperado,retornofeito);
		//fail("Not yet implemented");
	}

}
