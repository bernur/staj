package staj;

import java.util.Random;

public class RasgeleSayiTopla {

	public static void main(String[] args) {
		Random rasgeleSayi = new Random();
		int sayi1 = rasgeleSayi.nextInt(), sayi2 = rasgeleSayi.nextInt();
		
		System.out.println("Say� 1: " + sayi1 );
		
		System.out.println("Say� 2: " + sayi2 );
		
		System.out.println("Toplam�: " + (sayi1 + sayi2));
		

	}

}
