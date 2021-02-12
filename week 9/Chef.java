public class Chef extends Person{
    String workState;

    public Chef(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a Cheft and work in " + workState + ".");
    }
    
}