
public class Player {

	private int x;
	private int y;
	private int ancho;
	private int alto;
	private String c;
	
	public Player(int x,int y , int ancho , int alto , String color) {
		this.x=x;
		this.y=y;
		this.ancho=ancho;
		this.alto=alto;
		this.c=color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	public boolean colision(Player p1, Player obstaculo) {
		if (p1.x + p1.ancho <= obstaculo.x) {
            return false;
        }
        if (p1.y + p1.alto <= obstaculo.y) {
            return false;
        }
        if (p1.x > obstaculo.x + obstaculo.ancho) {
            return false;
        }
        if (p1.y > obstaculo.y + obstaculo.alto) {
            return false;
        }
        return true;

	}
	
}
