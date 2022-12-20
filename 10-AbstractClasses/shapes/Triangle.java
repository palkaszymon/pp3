package shapes;
public class Triangle extends Shape {

    private int a;
    private int h;
    private int b;
    private int c;

    Triangle(int a, int h){
        this.a=a;
        this.h=h;
    }

    public double area(){
        return a*h/2;
    }

    public double perimeter() {
        return a+b+c;
    }
}
