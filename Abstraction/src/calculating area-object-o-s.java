public class Main{
    public static float radius = 10.0f;
    public static void main(String[] a){
        System.out.println(Circle.area(radius));
    }
}

class Circle{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }
}



