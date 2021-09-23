
public class Dishes {

	private int ramen;
	private int sushi;
	private int pho;
	
	public Dishes() {
		
		ramen = (int)(Math.random() * 41);
		sushi = (int)(Math.random() * 41) + 10;
		pho = (int)(Math.random() * 41);
		
	}
}
