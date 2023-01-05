package com.conversor.funcionalidades;

import javax.swing.JOptionPane;

public interface MensajeFinal {

	public static void eligeOpcion(){
		int dialogoFinal = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación?");
		if(JOptionPane.OK_OPTION == dialogoFinal) {
			System.out.println("Seleccionaste Continuar");
			SeleccionaConversor.seleccion();
		} else {
			JOptionPane.showMessageDialog(null, "OK, HASTA LUEGO.");
		}
	}
}
