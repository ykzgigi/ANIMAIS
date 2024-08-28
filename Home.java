package curso28_08;

public class Home implements Computador{
	
	@Override
	public void ligar() {
	 System.out.println("Ligando");
	 
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando");
		
	}
	
	@Override
	public void carregar() {
		System.out.println("Carregando Sistema");
	}

}
