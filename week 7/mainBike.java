public class mainBike {
    public static void main(String[] args) {
        normalBike normalbike = new normalBike(80);
        

        System.out.println("NormalBike");        
        normalbike.datanormalBike();

        System.out.println("--------------------");

        moutainBike moutainbike = new moutainBike();
        System.out.println("MountainBike");
        moutainbike.current();
        moutainbike.gearUP(5);
        System.out.println("GearUP");
        moutainbike.current();
        moutainbike.setBrake();
        moutainbike.current();
        System.out.println();

    }
}
