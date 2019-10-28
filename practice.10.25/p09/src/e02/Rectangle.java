package e02;

public class Rectangle {

    private int length = 1;
    private int width = 1;

    public Rectangle(int width, int length) {

        this.width = width;
        this.length = length;
    }

    public void setLength (int length) {

        this.length = length;
    }

    public void setWidth (int width) {

        this.width = width;
    }

    public int getLength() {

        return length;
    }

    public int getWidth() {

        return width;
    }

    public void perimeter() {

        System.out.println("周长为" + (2 * length + 2 * width));
    }

    public void area() {

        System.out.println("面积为" + ( length * width));
    }
}