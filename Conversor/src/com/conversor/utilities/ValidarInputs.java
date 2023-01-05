package com.conversor.utilities;

public interface ValidarInputs {
	
	public static boolean validaValorMoneda(String texto) {
		return texto.matches("^[0-9]+([\\.][0-9]+)?$");
		
	}
	
	public static boolean validaValorTemperatura(String texto) {
		return texto.matches("^-?[0-9]+([\\.][0-9]+)?$");
		
	}
	
	
	
	/*public static void main(String[] args) {
		
		System.out.println(validaValorMoneda("5.5"));
	}*/
	

}