public class Car extends Vehicle {
    int maxSpeed;

    Car(int maxSpeed, int seats){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] array = {0,0};
        array[0] = this.getSeats();
        array[1] = this.maxSpeed;
        return array;
    }
}
