public class Athlete extends Person {
    String genre;
    public Athlete(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    public void playSport(){
        System.out.println(name+" is playing "+genre);
    }
}
