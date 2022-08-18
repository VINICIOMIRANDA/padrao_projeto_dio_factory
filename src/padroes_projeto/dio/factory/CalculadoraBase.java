package padroes_projeto.dio.factory;

abstract class CalculadoraBase {

	protected double valorA;
	protected double valorB;
	protected String sinal;
	
	abstract void calcular() ;
	
	public void executar(double valor1 , double valor2, String sinal) {
		
		System.out.println(valor1 +" "+ sinal+" "+valor2);
	}
		
	
}
