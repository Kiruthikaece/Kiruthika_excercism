class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distance = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
    this.speed=speed;
    this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
       return battery==0;
    }

    public int distanceDriven() {
      return distance;
    }

    public void drive() {
      if (!batteryDrained()) {
            distance = distance+speed;
            battery = battery-batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {

        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    private int distance;
    RaceTrack(int distance) {
      this.distance=distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
      while(!car.batteryDrained()){
            car.drive();
        }
        return (car.distanceDriven()>=distance)? true: false;
    }
}
