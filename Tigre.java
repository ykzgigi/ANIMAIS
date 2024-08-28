package curso28_08;

public class Tigre extends Animais{
	
	@Override
	public void dormir() {
		System.out.println("O Tigre está dormindo");
	}
	
	@Override
	public void caminhar() {
		System.out.println("O Tigre está caminhando");
	}
	
	@Override
	public void correr() {
		System.out.println("O Tigre está correndo");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Tigre está rugindo");
	}


}


