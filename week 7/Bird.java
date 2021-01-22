public class Bird extends Pet {
    String country;
    String fly;
    int speed;
    String size;
	public String isCanFly;
    public  Bird(String name,String species,int age,String color,int run,String can) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
        this.can = can;

    }

    public void flySpeed(){
        System.out.println("Bird fly at "+speed+" km/hr");
    }

    public void kick(){
        System.out.println(size+" My bird can "+can);
    }

    public void checkCountry(){
    
    if(this.country == "England") {
        System.out.println("England : true");
    }
    else System.out.println("England : false");
    }

    public void isCanFly(){
    
        if(this.fly == "Yes") {
            System.out.println("Fly : true");
        }
        else System.out.println("Fly : false");
        }
}