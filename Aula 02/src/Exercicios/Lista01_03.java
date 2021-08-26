package Exercicios;

import java.util.Scanner;

//3.Faça um programa que receba três notas e seus 
//respectivos pesos, calcule e mostre a média ponderada.

public class Lista01_03 {

	public static void main(String[] args) {
		
		float p1,p2,p3,media;
		int nota1=2, nota2=3, nota3=5;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digita nota P1: ");
		p1 = leia.nextFloat();
		
		System.out.println("Digita nota P2: ");
		p2 = leia.nextFloat();
		
		System.out.println("Digita nota P3: ");
		p3 = leia.nextFloat();
		
		media = ((p1*nota1) + (p2*nota2) + (p3*nota3)) /10;
		
		System.out.println("A média ponderada é: "+media);
					
	}

}
