package shapes;
public class Circle extends Shape{
    private int r;
    private double pi = Math.PI;

    Circle(int r){
        this.r = r;
    }

    public double area() {
        return pi*Math.pow(r, 2);
    }

    public double perimeter() {
        return 2*pi*r;
    }
}
