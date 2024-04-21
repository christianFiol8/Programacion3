
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
	
	public boolean colision(Player p1) {
		if (p1.x + p1.ancho <= this.x) {
            return false;
        }
        if (p1.y + p1.alto <= this.y) {
            return false;
        }
        if (p1.x > this.x + this.ancho) {
            return false;
        }
        if (p1.y > this.y + this.alto) {
            return false;
        }
        return true;

	}
	public boolean llegoMetea(Player p1, Player meta) {
		if (p1.x + p1.ancho <= meta.x) {
            return false;
        }
        if (p1.y + p1.alto <= meta.y) {
            return false;
        }
        if (p1.x > meta.x + meta.ancho) {
            return false;
        }
        if (p1.y > meta.y + meta.alto) {
            return false;
        }
        return true;

	}
}
	

