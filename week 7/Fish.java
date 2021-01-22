public class Fish extends Pet {
    String size;
    String water;
    int speed;
    public  Fish(String name,String species,int age,String color,int run,String can) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
        this.can = can;

    }

    public void swim(){
        System.out.println("My fish can swim "+speed+" km/hr");
    }

    public void swimFast(){
        System.out.println(size+" My fish swim "+can+" in the world");
    }

    public void isSwimtToTheSea(){
    
    if(this.water == "Salt water") {
        System.out.println("Salt water : true");
    }
    else System.out.println("Salt water : false");
    }
}