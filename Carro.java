package curso28_08;

public class Carro extends Abstrato_Veiculo {
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("Freando");
	}
	
	@Override
	public void virar() {
		System.out.println("Virando");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

}
