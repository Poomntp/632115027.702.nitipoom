public class normalBike extends bike {
    public normalBike(int currentspeed){
        this.currentspeed = currentspeed;
    }

    public void datanormalBike(){
        current();
        setspeedUp();
        current();
        setBrake();
        current();
    }
}
