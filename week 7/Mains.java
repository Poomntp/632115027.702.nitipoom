public class Mains {
    public static void main(String[] args) {
        Dogs dog = new Dogs("FlashDog", "Puddle", 100, "rainbow", 100, "hong hong");
        Fishs fish = new Fishs("FlashFish","Mackerel",50,"rainbow",100,"Fastest");
        Birds bird = new Birds("Liverpool","Liver bird",129,"red",100,"Fastest");
        
        System.out.println("My dog");
        dog.hair = "Short hair";
        dog.size = "Size 50 kg";
        dog.ShowPetData();
        dog.run();
        dog.bark();
        dog.isShortHair();

        System.out.println(" ");
        System.out.println("My fish");
        fish.water = "Salt water";
        fish.size = "Size 25 kg";
        fish.speed = 99;
        fish.ShowPetData();
        fish.swim();
        fish.swimFast();
        fish.isSwimtToTheSea();

        System.out.println(" ");
        System.out.println("My bird");
        bird.country = "England";
        bird.fly = "No";
        bird.speed = 1;
        bird.can = "kick a footbal";
        bird.size = "Size 4 kg";
        bird.ShowPetData();
        bird.flySpeed();
        bird.kick();
        bird.checkCountry();
        bird.isCanFly();



    }
}
