public class Dogs extends Pets {
    String size;
    String hair;
    public  Dogs(String name,String species,int age,String color,int run,String can) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.color = color;
        this.run = run;
        this.can = can;

    }

    public void run(){
        System.out.println("My dog can run "+run+" km/hr");
    }

    public void bark(){
        System.out.println(size+" My dog bark "+can);
    }

    public void isShortHair(){
    
    if(this.hair == "Short hair") {
        System.out.println("Short hair : true");
    }
    else System.out.println("Short hair : false");
    }
}
