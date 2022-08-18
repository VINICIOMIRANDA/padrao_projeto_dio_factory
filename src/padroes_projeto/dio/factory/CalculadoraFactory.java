package padroes_projeto.dio.factory;

public class CalculadoraFactory {
	
	public CalculadoraBase formulas(String formulasBaiscas ) {
		if (formulasBaiscas == null) {
			return null;
		}
		
		if(formulasBaiscas.equalsIgnoreCase("+")) {
			return new Adicao();
		}
		
		if(formulasBaiscas.equalsIgnoreCase("-")) {
			return new Subtracao();
		}
		
		if(formulasBaiscas.equalsIgnoreCase("*")) {
			return new Mulitplicacao();
		}
		
		if(formulasBaiscas.equalsIgnoreCase("/")) {
			return new Divisao();
		}
		
		
		return null;
	}

}
