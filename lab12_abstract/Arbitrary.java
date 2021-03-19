public class Arbitrary {
    public static void main(String[] args) {
        Shape square = new Square(10);
        System.out.print("Square : ");
        System.out.println(square.getArea());

        Shape triangle = new Triangle(5,10);
        System.out.print("Triangle : ");
        System.out.println(triangle.getArea());

        Shape rectangle = new Rectangle(4,10);
        System.out.print("Rectangle : ");
        System.out.println(rectangle.getArea());
    }
}
