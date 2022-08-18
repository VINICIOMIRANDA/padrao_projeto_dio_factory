package padroes_projeto.dio.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemostrandoFormulas {
	
	public static void main(String[] args) throws IOException {
		
		CalculadoraFactory calculadoraFactory = new CalculadoraFactory();
		
		Double valor1 = 5.0;
		Double valor2 = 4.0;
		
		System.out.println("Entre com a sinal da Formula (+Adição, - Subtração,/Divisão ,*Multiplicação");
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      
	      String formulaSinal = br.readLine();
	      
	      CalculadoraBase calculadora = calculadoraFactory.formulas(formulaSinal);
	      
	      System.out.println("Essa são as formulas ");
	      
	      calculadora.calcular();
	      calculadora.executar(valor1, valor2, formulaSinal);

	}

}
