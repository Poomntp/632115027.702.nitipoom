public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20);
        Chef chef = new Chef("Jo", 19);
        Athlete ath = new Athlete("Poom", 19);
        Gamer game = new Gamer("Hin", 19);
        Doctor doc = new Doctor("Ford", 19);
        Painter paint = new Painter("Lit", 19);

        System.out.println("Person 1");
        art.genre ="hip hop";
        art.gender = "Male";
        art.introduce();
        art.playMusic();

        System.out.println("Person 2");
        chef.genre ="a steak.";
        chef.gender = "Male";
        chef.introduce();
        chef.cookFood();

        System.out.println("Person 3");
        ath.genre ="Basketball.";
        ath.gender = "Male";
        ath.introduce();
        ath.playSport();

        System.out.println("Person 4");
        game.genre ="Dota2.";
        game.gender = "Male";
        game.introduce();
        game.playGame();

        System.out.println("Person 5");
        doc.genre ="treating patients.";
        doc.gender = "male";
        doc.introduce();
        doc.treatingPatients();
    
        System.out.println("Person 6");
        paint.genre ="a picture.";
        paint.gender = "Female";
        paint.introduce();
        paint.drawPicture();
    }
}
