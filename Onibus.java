package curso28_08;

public class Onibus extends Abstrato_Veiculo{
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando o Onibus");
	}
	
	@Override
	public void frear() {
		System.out.println("Freando o Onibus");
	}
	
	@Override
	public void virar() {
		System.out.println("Virando o Onibus");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando o Onibus");
	}

}


