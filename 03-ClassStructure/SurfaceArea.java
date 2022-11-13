public class SurfaceArea {
    public static double circleArea(double radius){
        return radius * 3.14;
    }
    public static double triangleArea(double a, double h){
        return a * h/2;
    }
    public static double rectangleArea(double a, double b){
        return a * b;
    }
    public static void main(String[] args){
    System.out.println(circleArea(3));
    System.out.println(triangleArea(3, 4));
    System.out.println(rectangleArea(4, 5));
    }
}
