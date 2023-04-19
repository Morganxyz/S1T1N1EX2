package n1Ex2Damat;

public class n1Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invocació d´un mètode no estatic
		
		Cotxe c1 = new Cotxe("marca","model",0);
		System.out.println(c1.accelerar()); // Al ser un mètode no estàtic, s´ha de cridat mitjançant 
		//un objecte instanciat previament.
		
		System.out.println(Cotxe.frenar()); //Al ser un mètode estàtic es pot cridar des de la mateixa 
		//classe.
	}

}
