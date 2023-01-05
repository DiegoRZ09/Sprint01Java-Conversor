package com.conversor.funcionalidades;

import javax.swing.JOptionPane;

import com.conversor.utilities.ValidarInputs;

public interface IngresarValores {
	
	public static void IngresarValorMoneda(){
		
		String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
		System.out.println(ValidarInputs.validaValorMoneda(input));

		if(ValidarInputs.validaValorMoneda(input)) {
			
			double valorRecibido = Double.parseDouble(input);
			Convertir.ConvierteMoneda(valorRecibido);
			MensajeFinal.eligeOpcion();
			
		} else {
			JOptionPane.showMessageDialog(null, "Valor NO válido (Sólo números enteros y decimales positivos)");
			MensajeFinal.eligeOpcion();
		}	
	}
	
	public static void IngresarValorTemperatura() {
			
		String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
		System.out.println(ValidarInputs.validaValorTemperatura(input));
		
		if(ValidarInputs.validaValorTemperatura(input)) {
			double valorRecibido = Double.parseDouble(input);
			Convertir.ConvierteTemperatura(valorRecibido);
			MensajeFinal.eligeOpcion();
		}  else {
			JOptionPane.showMessageDialog(null, "Valor NO válido (Sólo valores numéricos)");
			MensajeFinal.eligeOpcion();
		}	

	}

}
