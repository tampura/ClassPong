
public class Desserts {

	private int cookies;
	private int macarons;
	private int cakes;
	
	public Desserts() {
		
		cookies = (int)(Math.random() * 109) + 12;
		macarons  = (int)(Math.random() * 181) + 20;
		cakes = (int)(Math.random() * 36) + 5;
	}
}
