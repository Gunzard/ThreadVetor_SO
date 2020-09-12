package controller;

public class ThreadVetorController extends Thread {
	
	private int vet[];
	private int num;
	
	public ThreadVetorController(int vet[] , int num) {
		this.vet=vet;
		this.num=num;
	}
	
	@Override
	public void run() {
		calcVetor();
	}

	private void calcVetor() {
		double tempo_final,tempo_inicial,tempo_total;
		String pi;
		tempo_inicial = System.nanoTime();
		if (num % 2 == 0){
			pi = "for";
			for (int i = 0 ; i<vet.length ; i++);
		}else {
			pi = "foreach";
			for (int i : vet);
		}
		tempo_final = System.nanoTime();
	    tempo_total = ( tempo_final - tempo_inicial );
		tempo_total = tempo_total / Math.pow(10, 9);
		System.out.println("Tempo do " + pi +" ==> "+tempo_total+ "s.");		
	
	}
}
