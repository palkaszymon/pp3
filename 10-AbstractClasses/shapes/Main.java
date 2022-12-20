package shapes;
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Triangle t1 = new Triangle(5,4);
        Circle c1 = new Circle(6);
        System.out.println("Rectangle");
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println("Triangle");
        System.out.println(t1.area());
        System.out.println(t1.perimeter());
        System.out.println("Circle");
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
