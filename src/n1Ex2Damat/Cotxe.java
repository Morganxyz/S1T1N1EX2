package n1Ex2Damat;

public class Cotxe {
	
	private static final String marca = "Ferrari";
	private static String model;
	final int potencia = 1500;
	
	public Cotxe(String marca,String model, int potencia) {
		//Cotxe.marca = "Honda"; No es pot inicialitzar perque és final. Stàtic determina que es un atribut
		//de classe, no de cada un dels objectes que es creen.
		Cotxe.model = "500"; //Es pot inicialitzar perque, encara que es estática, no es final.Stàtic
		//determina que es un atribut de classe, tot i que es pot canviar perque no és final.
		//this.potencia = 2000; No es pot inicialitzar perque és final.
	}
	
	public static String frenar() {
		return "El cotxe està frenant!";
	}
	public String accelerar() {
		return "El cotxe està accelerant!";
	}

}
