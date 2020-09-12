package view;

import controller.ThreadVetorController;

public class Principal {
	
	public static void main(String[] args) {
		int vetor[] = new int[1000];
		for (int i = 0 ; i < 1000; i++){
			vetor[i] = (int)(Math.random() * 100)+1;
		}
		Thread tv = new ThreadVetorController(vetor, 1);
		tv.start();
		Thread tv2 = new ThreadVetorController(vetor, 2);
		tv2.start();
	}

}
