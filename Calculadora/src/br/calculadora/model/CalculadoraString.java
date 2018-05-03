package br.calculadora.model;

public class CalculadoraString {

	public static int soma(String valores) {
		int resultado = 0;
		String[] arrayDeNumeros = valores.split(",");
		if (arrayDeNumeros.length > 2) {
			throw new RuntimeException("Até 2 numeros separados por virgula sao permitidos");
		} else {
			for (String numero : arrayDeNumeros) {
				if (!numero.isEmpty()) {
					resultado += Integer.parseInt(numero); // Se nao for um numero dispara
														  // uma excecao
				}
			}
		}
		return resultado;
	}

}
