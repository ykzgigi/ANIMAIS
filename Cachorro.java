package curso28_08;

public class Cachorro extends Animais{
	
	@Override
	public void dormir() {
	System.out.println("O Cachorro está dormindo");
	}
	@Override
	public void caminhar() {
	System.out.println("O Cachorro está caminhando");
	}
	@Override
	public void correr() {
	System.out.println("O Cachorro está correndo");
	}
	@Override
	public void emitirSom() {
	System.out.println("O Cachorro está latindo");
	}

}
