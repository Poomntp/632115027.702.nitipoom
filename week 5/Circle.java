public class Circle {
    private double radius = 0;
    private double i = 0;
    private double j = 0;
    private static int numObject = 0;

    public Circle(double i, double j) {
        numObject++;
        this.i = i;
        this.j = j;
        this.radius = 1;
    }

    public Circle(double i, double j, double radius) {
        numObject++;
        this.i = i;
        this.j = j;
        this.radius = radius;
    }

    public void Area() {
        if (radius < 0) {
            System.out.println("Area of cir" + numObject + " = 0");
        } else {
            System.out.println("Area of cir" + numObject + " = " + Math.PI * (radius * radius));
        }
    }

    public void Circum() {
        if (radius < 0) {
            System.out.println("CircumFrenece = 0");
        } else {
            System.out.println("CircumFrenece = " + (2 * Math.PI * radius));
        }
    }

    public boolean Intersect(Circle C2) {
        double Distance = Math.sqrt(Math.pow(this.i - C2.i, 2) + Math.pow(this.j - C2.j, 2));
        if (Distance > this.radius + C2.radius) {
            return false;
        } else {
            return true;
        }
    }
}
