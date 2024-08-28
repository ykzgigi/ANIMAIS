package curso28_08;

public class PrincipalComputador {

	public static void main(String[] args) {

		Home home = new Home();
		Gamer gamer = new Gamer();

		System.out.println("~~~~~~COMPUTADOR 01- (GAMER)~~~~~~");
		
		System.out.println(" ");
		
		gamer.ligar();
		gamer.desligar();
		gamer.reiniciar();
		gamer.carregar();
		
		System.out.println(" ");
		
		System.out.println("~~~~~~COMPUTADOR 01- (HOME)~~~~~~");
		
		System.out.println(" ");
		
		home.ligar();
		home.desligar();
		home.reiniciar();
		home.carregar();
	}

}
