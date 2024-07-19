
public class MountainBike extends Bicycle {
	private double weight;
	private int gear;
	
	public MountainBike(String manufacturer, String color) {
		super(manufacturer, color);
		this.weight = 10;
		this.gear = 10;
	}

	public MountainBike(String manufacturer, String color, double weight, int gear) {
		super(manufacturer, color);
		if (weight > 0) {
			this.weight = weight;
		}
		if (gear >= 1 && gear <= 20) {
			this.gear = gear;
		}
	}

	@Override
	public String toString() {
		return "MountainBike [weight=" + weight + ", gear=" + gear + super.toString() + "]";
	}
	
	public void dec() {
		if(this.gear > 1 && this.gear <= 20) {
			this.gear -= 1;
		}
	}
	
	public void inc() {
		if(this.gear >= 1 && this.gear < 20) {
			this.gear += 1;
		}
	}
	
	public void stop() {
		while (this.speed > 0) {
			this.applyBrake(10);
			if(this.gear >1) {
				this.dec();
			}
		}
	}
	
	
}
