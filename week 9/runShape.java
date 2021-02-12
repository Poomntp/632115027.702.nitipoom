public class runShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Rectangle rectangle  = new Rectangle(10, 15);
        System.out.println(rectangle.toString());

        Cube cube = new Cube(5);
        System.out.println(cube.toString());
    }
}
