package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.calculadora.model.Calculadora;

public class TestaCalculadora {
    //especificar no formato de teste o comportamento esperado da calculadora
	@Test
	public void quando2inteirosSaoPassadosComoParametroDeveSomarComSucesso() {
		//cenario
		int a = 2;
		int b = 3;
		Calculadora calculadora = new Calculadora();
		
		//acao
		int resultadoObtido = calculadora.soma(2,3);
		
		//verificacao
		assertEquals(2+3,resultadoObtido);
	}

}
