//OK. O.Aktunc

public class Fan {

	int speed;
	boolean fanStatus;
	double radius;
	String color;

	public Fan(int fanSpeed, int fanOn, double fanRadius, String fanColor) {
		if (fanOn ==1)
			fanStatus = true;
		else
			fanStatus = false;
		speed = fanSpeed;
		radius = fanRadius;
		color = fanColor;
	}

	public Fan() {
		speed = 0;
		fanStatus = false;
		radius = 1;
		color = "blue";
	}

	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", fanStatus=" + fanStatus + ", radius="
				+ radius + ", color=" + color + "]";
	}

}
