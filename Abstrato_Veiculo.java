package curso28_08;

public abstract class Abstrato_Veiculo {
	String placa;
	String modelo;
	String cor;
	int ano;
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	public abstract void virar();
	
	public abstract void ligar();
}
