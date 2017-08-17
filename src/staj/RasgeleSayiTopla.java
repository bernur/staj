package staj;

import java.util.Random;

public class RasgeleSayiTopla {

	public static void main(String[] args) {
		Random rasgeleSayi = new Random();
		int sayi1 = rasgeleSayi.nextInt(), sayi2 = rasgeleSayi.nextInt();
		
		System.out.println("Sayý 1: " + sayi1 );
		
		System.out.println("Sayý 2: " + sayi2 );
		
		System.out.println("Toplamý: " + (sayi1 + sayi2));
		

	}

}
