package com.conversor.conversorMonedas;

import javax.swing.JOptionPane;

import com.conversor.consumirAPI.Conectar;

public class ConvertirMonedas {
	
	Conectar valor = new Conectar();
	//Moneda Nacional (MXN) a Divisas Extranjeras
	
	public void PesosADolar(double valorRecibido) {
		
		double monedaEnDolar = valorRecibido * valor.ObtenerFactorConversion("MXN", "USD");
		monedaEnDolar = Math.round(monedaEnDolar*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Pesos es equivalente a: "
				+ monedaEnDolar + " Dólares.");
	}
	
	public void PesosAEuro(double valorRecibido) {
		
		double monedaEnEuro = valorRecibido * valor.ObtenerFactorConversion("MXN", "EUR");
		monedaEnEuro = Math.round(monedaEnEuro*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Pesos es equivalente a: "
				+ monedaEnEuro + " Euros.");
	}
	
	public void PesosALibra(double valorRecibido) {

		double monedaEnLibra = valorRecibido * valor.ObtenerFactorConversion("MXN", "GBP");
		monedaEnLibra = Math.round(monedaEnLibra*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Pesos es equivalente a: "
				+ monedaEnLibra + " Libras.");
	}

	public void PesosAYen(double valorRecibido) {

		double monedaEnYen = valorRecibido * valor.ObtenerFactorConversion("MXN", "JPY");
		monedaEnYen = Math.round(monedaEnYen*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Pesos es equivalente a: "
				+ monedaEnYen + " Yenes.");
	}

	public void PesosAWon(double valorRecibido) {

		double monedaEnWon= valorRecibido * valor.ObtenerFactorConversion("MXN", "KRW");
		monedaEnWon = Math.round(monedaEnWon*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Pesos es equivalente a: "
				+ monedaEnWon + " Wones.");
	}
	
	//Divisas Extranjeras a Moneda Nacional (MXN)
	
	public void DolarAPesos(double valorRecibido) {
		
		
		double dolarEnMoneda = valorRecibido * valor.ObtenerFactorConversion("USD","MXN");
		dolarEnMoneda = Math.round(dolarEnMoneda*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Dólares es equivalente a: "
				+ dolarEnMoneda + " Pesos.");
	}
	
	public void EuroAPesos(double valorRecibido) {
		
		double euroEnMoneda = valorRecibido * valor.ObtenerFactorConversion("EUR", "MXN");
		euroEnMoneda = Math.round(euroEnMoneda*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Euros es equivalente a: "
				+ euroEnMoneda + " Pesos.");
	}
	
	public void LibraAPesos(double valorRecibido) {

		double libraEnMoneda = valorRecibido * valor.ObtenerFactorConversion("GBP", "MXN");
		libraEnMoneda = Math.round(libraEnMoneda*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Libras es equivalente a: "
				+ libraEnMoneda + " Pesos.");
	}

	public void YenAPesos(double valorRecibido) {

		double yenEnMoneda = valorRecibido * valor.ObtenerFactorConversion("JPY", "MXN");
		yenEnMoneda = Math.round(yenEnMoneda*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Yenes es equivalente a: "
				+ yenEnMoneda + " Pesos.");
	}

	public void WonAPesos(double valorRecibido) {

		double wonEnMoneda= valorRecibido * valor.ObtenerFactorConversion("KRW", "MXN");
		wonEnMoneda = Math.round(wonEnMoneda*100d)/100d;
		JOptionPane.showMessageDialog(null, valorRecibido + 
				" Wones es equivalente a: "
				+ wonEnMoneda + " Pesos.");
	}

}
