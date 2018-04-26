package br.calculadora.model;

public class CalculadoraString {

	public static int soma(String valores) {
		//throw new RuntimeException("Até 2 numeros separados por virgula sao permitidos");
		String[] arrayDeNumeros = valores.split(",");
		if (arrayDeNumeros.length > 2) {
			throw new RuntimeException("Até 2 numeros separados por virgula sao permitidos");
		}else {
            for (String number : arrayDeNumeros) {
                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
        }
		return 0;
	}

}
