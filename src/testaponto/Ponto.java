package testaponto;

public class Ponto {
	private int x, y;
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return this.x + ", " + this.y;
	}
	@Override
	public boolean equals(Object o) {
		if (x == y) {
			return true;
		}
		else {
			return false;
		}
	}
	public double distancia(Ponto p) {
		int dx = this.x - p.x;
		int dy = this.y - p.y;
		return Math.sqrt(dx*dx + dy*dy); 
	}
}