public class Painter extends Person {
    String genre;
    public Painter(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    public void drawPicture(){
        System.out.println(name+" is drawing "+genre);
    }
}
