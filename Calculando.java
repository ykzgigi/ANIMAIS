package curso28_08;

public class Calculando implements Calculos{
	
	@Override
	public double somar() {
	 return 10+10;
	 
	}
	
	@Override
	public double sub() {
		return 30-10;
	}
	
	@Override
	public double mult() {
		return 20*3;
		
	}
	
	@Override
	public int div() {
		return 4/6;
	}
	
	@Override
	public int exp() {
		return 2^6;
	}


}
