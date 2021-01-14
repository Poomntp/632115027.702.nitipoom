public class Doctor extends Person {
    String genre;
    public Doctor(String name, int age){
        this.name = name;
        this.age = age;
       
    }

    public void treatingPatients(){
        System.out.println(name+" is "+genre);
    }
}
