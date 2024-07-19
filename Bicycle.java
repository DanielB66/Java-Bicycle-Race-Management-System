
public class Bicycle {
	
	private String manufacturer ; // יצרן
	private String color = "black"; // צבע
	protected int speed = 0; // מהירות

	public Bicycle(String manufacturer, String color) {
		this.manufacturer = manufacturer;
		this.color=color;
		this.speed = 0;
	}

	public void applyBrake(int decrement) {
		speed = Math.max(0, speed - decrement);
	}

	public void speedUp(int increment) {
		speed += increment;
	}

 @Override
 	public String toString() {
	 return "Bicycle [manufacturer=" + manufacturer
			 + ", color=" + color + ", speed=" + speed + "]";
 	}

 	public int getSpeed() {
 		return speed;
 	}
}