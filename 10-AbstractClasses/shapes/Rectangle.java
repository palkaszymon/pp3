package shapes;
public class Rectangle extends Shape{
    private int a;
    private int b;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double area(){
        return a*b;
    }

    public double perimeter() {
        return 2*a+2*b;
    }
}
