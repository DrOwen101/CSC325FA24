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

<<<<<<< HEAD
        MarkSharovarovCar carMark = new MarkSharovarovCar("BMW", "Black", 2017);
        System.out.println(carMark.getCarAgeAndNumberOfOilChanges());
=======
        TuckerJonesCar tuckercar = new TuckerJonesCar("Honda", "Insight", "Grey", 2021);
        System.out.println(tuckercar.oilChange());
        
        KalebGoreCar kalebcar = new KalebGoreCar("Suzuki", "Green", "1999");
        System.out.println(kalebcar.numberOfOilChanges());

        AndiaKaranjaCar andiacar = new AndiaKaranjaCar("Toyota", "gold", 1999);
        System.out.println(andiacar.carAgeAndOilChange());
>>>>>>> main
    }
}
