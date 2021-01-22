public class bike {
    int currentspeed;
    int gear = 5;

    public void setspeedUp(){
        this.currentspeed += 5;
        System.out.println("Speedup");
        }

    public void setBrake(){
        this.currentspeed -= 5;
        System.out.println("Brake");
    }

    public void current(){
        if(this.currentspeed <= 99){
            System.out.println("The current speed is >> " + currentspeed);
        }else{
            System.out.println("Over Speed!!!");
        }
    }
}