public class Gamer extends Person {
    String genre;
    public Gamer(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    public void playGame(){
        System.out.println(name+" is playing "+genre);
    }
}