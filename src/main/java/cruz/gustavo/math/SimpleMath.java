package cruz.gustavo.math;

public class SimpleMath {

	public Double sum( Double numberOne, Double numberTwo) {
		
		return numberOne + numberTwo;
	}
	
	public Double sub( Double numberOne, Double numberTwo) {
		
		return numberOne - numberTwo;
	}
	
	public Double mul( Double numberOne, Double numberTwo) {
		
		return numberOne * numberTwo;
	}
	
	public Double div( Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double med( Double numberOne,  Double numberTwo) {
		return (numberOne + numberTwo)/2;
	}
	
	public Double raiz( Double numberOne) {
		return Math.sqrt(numberOne);
	}
	
}
