public class Shape {
    String shape;

    public Shape(){
       this.shape = "shape";
    }

    public String toString(){
        return "This is a " + shape;
    }

	public char[] Rectangle(int i, int j) {
		return null;
	}
}

class Rectangle extends Shape {
    int heigth = 0;
    int width = 0;

    public Rectangle() {

    }
    public Rectangle(int height,int width){
        super();
        this.heigth  = height;
        this.width = width;
        this.shape = "Rectangle";
    }
    public String toString(){
        return "This is a " + shape +" width as " + width + " and height as " + heigth;
    }
}

class Cube extends Shape {
    int length;

    public Cube() {

    }
    public Cube(int length){
        super();
        this.length = length;
        this.shape = "Cube";
    }
    public String toString(){
        return "This is a " + shape +" with the side of " + length;
    }
}