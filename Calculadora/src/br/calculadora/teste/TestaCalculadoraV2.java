package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.calculadora.model.CalculadoraString;
//Crie uma calculadora simples de String com um método int Add (string numbers)
//O método pode ter 0, 1 ou 2 números e retornará sua soma (para uma string vazia retornará 0) por exemplo “” ou “1” ou “1,2”
public class TestaCalculadoraV2 {
	
	 	@Test(expected = RuntimeException.class)
	    public final void quandoMaisDoQue2NumerosSaoUsadosEntaoExceptionDisparada() {
	 		//cenario
	 		String parcela = "1,2,3";
	 		//acao
	        CalculadoraString.soma(parcela);
	        //verificacao
	    }
	 	
	 	@Test(expected = RuntimeException.class)
	    public final void quandoUmaLetraEhPassadaComoParametroThenExceptionIsThrown() {
	 		//cenario
	 		String parcela = "1,X";
	 		//acao
	        CalculadoraString.soma(parcela);
	        //verificacao
	    }
	 	@Test
	    public final void quandoDoisNumerosSaoPassadosRetornaASoma() {
	 		//cenario
	 		String parcela = "3,2";
	 		//acao
	        int resultadoObtido = CalculadoraString.soma(parcela);
	        //verificacao
	        assertEquals(3+2,resultadoObtido);
	    }
}
