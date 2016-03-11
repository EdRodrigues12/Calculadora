package br.fatec.servico;

public class Calculadora {
	public int soma(String parcelas){
		
		int resultado = 0;
		String[] vetorNumeros = parcelas.split(",");
		for(String numero : vetorNumeros){
			resultado += Integer.parseInt(numero);
		}
		return resultado;
	}

}
