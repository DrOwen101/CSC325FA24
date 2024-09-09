public class MainApp {
    public static void main(String[] args) throws Exception {
        TraceHookCar tracecar = new TraceHookCar("Chevy", "Black", 2008);
        System.out.println(tracecar.calculateCarAgeAndOilChanges());

        JacksonBradleyCar jacksoncar = new JacksonBradleyCar("Ford", "Blue", 1989);
        System.out.println(jacksoncar.oilChangeNeeded());

        AlanaGarciaCar alanacar = new AlanaGarciaCar("Honda", "Accord", "Yellow", 2020);
        System.out.println(alanacar.calculateCarAgeAndOilChange());
        
        ethanFowlerCar ethancar = new ethanFowlerCar("Suzuki", "Green", 1999);
        System.out.println(ethancar.yearsOld());

        EmiliaKubikCar emiliacar = new EmiliaKubikCar("Suzuki", "Green", 1999);
        System.out.println(emiliacar.carAge());

        KalebGoreCar kalebcar = new KalebGoreCar("Suzuki", "Green", "1999");
        System.out.println(kalebcar.numberOfOilChanges());

        AndiaKaranjaCar andiacar = new AndiaKaranjaCar("Toyota", "gold", 1999);
        System.out.println(andiacar.carAgeAndOilChange());
        
    }
}
