public class Square extends Shape{
    double side;
    public Square(double side){
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }
    
}