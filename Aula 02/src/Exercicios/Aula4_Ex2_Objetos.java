package Exercicios;

public class Aula4_Ex2_Objetos {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Ford", "KA", "Vermelho", 2015);
		Carro carro2 = new Carro("Chevrolet", "Onix", "Preto", 2019);
		Carro carro3 = new Carro("Fiat", "Uno", "Prata", 2010);
		
		System.out.println(carro1.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro3.getCor());
	}
}
