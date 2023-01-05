package com.conversor.consumirAPI;

import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;


public class  Conectar{

	
		
		public double ObtenerFactorConversion(String divisaOrigen, String divisaDestino){
			
			double factorConversion = 0;
			
			try {
				URL url = new URL("https://api.exchangerate.host/latest?base=" + divisaOrigen + "&symbols=" + divisaDestino);
				HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				con.connect();
				
				int codigoRespuesta = con.getResponseCode();
				
				if (codigoRespuesta != 200) {
					throw new RuntimeException("Ocurrió un error: " + codigoRespuesta);
				} else {
					
					StringBuilder stringRespuesta = new StringBuilder();
					Scanner scanner = new Scanner(url.openStream());
					
					while(scanner.hasNext()) {
						stringRespuesta.append(scanner.nextLine());
					}
					
					scanner.close();
					
					System.out.println(stringRespuesta);
					
					String prueba = "[" + stringRespuesta + "]";
					
					
					JSONArray arregloJson = new JSONArray(prueba);
					
					for(int indice = 0; indice < arregloJson.length(); indice ++) {
						
						JSONObject buscando = arregloJson.getJSONObject(indice);
						
						JSONObject valorEncontrado = buscando.getJSONObject("rates");
					
						System.out.println(valorEncontrado);
						
						factorConversion = valorEncontrado.getDouble(divisaDestino);
						
						System.out.println(factorConversion);
						
					}
				
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return factorConversion;
			
		}
		
	
	
	
}
