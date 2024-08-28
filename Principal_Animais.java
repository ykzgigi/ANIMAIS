package curso28_08;

public class Principal_Animais {

	public static void main(String[] args) {

		Gato garfield = new Gato();
		Cachorro bilu = new Cachorro();
		Lobo2 lucio = new Lobo2();
		Tigre miau = new Tigre();
		Leao zulu = new Leao();

		garfield.dormir();
		garfield.caminhar();
		garfield.correr();
		garfield.emitirSom();

		bilu.dormir();
		bilu.caminhar();
		bilu.correr();
		bilu.emitirSom();

		lucio.dormir();
		lucio.caminhar();
		lucio.correr();
		lucio.emitirSom();

		zulu.dormir();
		zulu.caminhar();
		zulu.correr();
		zulu.emitirSom();

		miau.dormir();
		miau.caminhar();
		miau.correr();
		miau.emitirSom();



		System.out.println("°°°°°°°°°°°°°°°°°TIGRE°°°°°°°°°°°°°°°°");

		miau.setNome("Simba ");
		miau.setSexo("M");
		miau.setRaca("Tigre-siberiano");

		System.out.println(miau.getNome());
		System.out.println(miau.getSexo());
		System.out.println(miau.getRaca());
		miau.caminhar();
		miau.correr();
		miau.emitirSom();
		miau.dormir();



		System.out.println("°°°°°°°°°°°°°°°°°LOBO°°°°°°°°°°°°°°°°");

		lucio.setNome("LUCIO");
		lucio.setSexo("M");
		lucio.setRaca("Lobo-Cinzento");

		System.out.println(lucio.getNome());
		System.out.println(lucio.getSexo());
		System.out.println(lucio.getRaca());
		lucio.caminhar();
		lucio.correr();
		lucio.emitirSom();
	    lucio.dormir();


		System.out.println("°°°°°°°°°°°°°°°°°CACHORRO°°°°°°°°°°°°°°°°");

		bilu.setNome("BILU");
		bilu.setSexo("M");
		bilu.setRaca("Vira-Lata");

		System.out.println(bilu.getNome());
		System.out.println(bilu.getSexo());
		System.out.println(bilu.getRaca());
		bilu.caminhar();
		bilu.correr();
		bilu.emitirSom();
		bilu.dormir();

		System.out.println("°°°°°°°°°°°°°°°°°LEÃO°°°°°°°°°°°°°°°°");

		zulu.setNome("ZULU");
		zulu.setSexo("M");
		zulu.setRaca("Leão-do-Atlas");

		System.out.println(zulu.getNome());
		System.out.println(zulu.getSexo());
		System.out.println(zulu.getRaca());
		zulu.caminhar();
		zulu.correr();
	    zulu.emitirSom();
		zulu.dormir();


		System.out.println("°°°°°°°°°°°°°°°°°GATO°°°°°°°°°°°°°°°°");

		garfield.setNome("ZULU");
		garfield.setSexo("M");
		garfield.setRaca("Siamês");

		System.out.println(garfield.getNome());
		System.out.println(garfield.getSexo());
		System.out.println(garfield.getRaca());
		garfield.caminhar();
		garfield.correr();
		garfield.emitirSom();
		garfield.dormir();
	}
}



