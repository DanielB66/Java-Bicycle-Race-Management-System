
public class Box {
	private int length;
	private int height;
	private int width;
	
	public Box() {
	this.length = 10;
	this.height = 30;
	this.width = 20;
	}
	
	public Box(int length,int height,int width) {
		if(length >= 1 && height >= 1 && width >= 1) {
			this.length = length;
			this.height = height;
			this.width = width;
		}
		else {
			System.out.println("not valid");
		}
	}
	
	public int faceArea() {
		int faceArea = (length * height + length * width + height * width) * 2;
		return faceArea;
	}
	
	public int volume() {
		int volume = length * height * width;
		return volume;
	}
	
	public boolean equals(Box other) {
		if(this.height == other.height && this.length == other.length && this.width == other.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isCube() {
		if(this.height == this.length && this.height == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquareBox() {
		if(this.height == this.length || this.height == this.width || this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", height=" + height + ", width=" + width + ", faceArea=" + faceArea()
				+ ", volume=" + volume() + "]";
	}
	
	public boolean FitInside(Box other) {
		if(this.height< other.height && this.length < other.length && this.width< other.width) {
			return true;
		}
		else {
			return false;
		}
	}
}
