package com.conversor.funcionalidades;

import javax.swing.JOptionPane;

public interface SeleccionaConversor {
	
	public static void seleccion(){
		
		
		Object[] posiblesOpciones = {"Conversor de Moneda", "Conversor de Temperatura"};
		
		String opcionSeleccionada = (JOptionPane.showInputDialog(null,
				"Selecciona un conversor", "Sprint 01 Conversor",
				JOptionPane.QUESTION_MESSAGE, null,
				posiblesOpciones, posiblesOpciones[0])).toString();
		
		switch (opcionSeleccionada) {
			case "Conversor de Moneda" : 
				IngresarValores.IngresarValorMoneda();
			break;
			
			case "Conversor de Temperatura" : 
				IngresarValores.IngresarValorTemperatura();
			break;

		}
	}


}
