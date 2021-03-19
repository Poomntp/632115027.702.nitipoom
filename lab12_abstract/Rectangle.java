public class Rectangle extends Shape{
    double widght;
    double length;
    public Rectangle(double widght, double length){
        this.widght = widght;
        this.length = length;
        
    }

    public double getArea() {
        return widght*length;
    }
    
}