

public class Ball implements Comparable {
	String color = "";

	public Ball(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + "]";
	}

	@Override
	public int compareTo(Object o) {
		Ball b2 = (Ball)o;			
		return (this.getColor().compareTo(b2.getColor()));
	}
	
	
}
