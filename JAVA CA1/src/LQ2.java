public class LQ2 {

    public static void main(String[] args)
    {
        Circle obj1 = new Circle();
        obj1.Area(3);

        Rectangle obj2 = new Rectangle();
        obj2.Area(30,20);

        Triangle obj3 = new Triangle();
        obj3.Area(30,20);
    }
}

class Circle
{
    // calculate the area of the circle.
    static final double PI = Math.PI;
    void Area(double r)
    {
        double A = PI * r * r;
        System.out.println("Area of the circle is :" + A);
    }
}

class Rectangle
{
    // calculate the area of the rectangle
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}

class Triangle
{
    // calculate the area of the square
    void Area(double b,double h)
    {
        System.out.println("Area of the Triangle: "+ (b*h)/2.0);
    }
}
