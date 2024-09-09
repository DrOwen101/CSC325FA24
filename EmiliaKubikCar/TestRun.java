public class TestRun {
    public static void main(String[] args) {
        EmiliaKubikCar car = new EmiliaKubikCar("Honda", "black", 2013);

        System.out.println(car.getType());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
        System.out.println(car.carAge());
    }
}
