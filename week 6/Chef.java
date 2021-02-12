public class Chef extends Person {
    String genre;
    public Chef(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    public void cookFood(){
        System.out.println(name+" is cooking "+genre);
    }
}
