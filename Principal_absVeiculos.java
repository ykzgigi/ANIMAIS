package curso28_08;

public class Principal_absVeiculos {

	public static void main(String[] args) {
		
		Onibus busao = new Onibus();
		Carro gol = new Carro();
		
		
		
		System.out.println("~~~~ONIBUS~~~~");
		
		System.out.println(" ");
		
		busao.acelerar();
		busao.frear();
		busao.virar();
		busao.ligar();
		
		
		System.out.println(" ");
		
		System.out.println("~~~~CARRO~~~~");
		
		System.out.println(" ");
		
		gol.acelerar();
		gol.frear();
		gol.virar();
		gol.ligar();
		
	}

}
