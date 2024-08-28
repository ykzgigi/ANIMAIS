package curso28_08;

public class Lobo2 extends Animais{
	
	@Override
	public void dormir() {
		System.out.println("O Lobo está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Lobo está caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O Lobo está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Lobo está uivando");
	}


}
