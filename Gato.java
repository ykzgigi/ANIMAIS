package curso28_08;

public class Gato extends Animais{
	
	@Override
	public void dormir() {
		System.out.println("O Gato está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O gato está caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O gato está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato está miando");
	}

}
