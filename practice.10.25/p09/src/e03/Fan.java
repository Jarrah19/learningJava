package e03;

public class Fan {

    private int speed;
    private boolean on;
    private double radius;

    public Fan(int speed, boolean on, double radius) {

        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public int getSpeed() {

        return speed;
    }

    public boolean getOn() {

        return on;
    }

    public double getRadius() {

        return radius;
    }

    public String toString() {

        return speed + "档电风扇半径" + radius + "厘米" + (on? "开启中" : "关闭中");
    }
}