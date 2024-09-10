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

        EthanSextonCar ethanscar = new EthanSextonCar("Suzuki", "Green", 1999);
        System.out.println(ethanscar + "\n" + ethanscar.getOil(ethanscar.getYear()));

        JahzaraBroasterCar car= new JahzaraBroasterCar("Toyota", "Blue", 2000);
        System.out.println(car.CarCalculation());

        BrooklynWellsCar brooklynCar = new BrooklynWellsCar("Acura", "Red", 1990);
        System.out.println(brooklynCar.oilChange());
      
        MarkSharovarovCar markCar = new MarkSharovarovCar("BMW", "Black", 2015);
        System.out.println(markCar.getCarAgeAndNumberOfOilChanges());

        SravaniKadiyalaCar sravanicar = new SravaniKadiyalaCar("Ford Fusion", "Gold", 2019);
        System.out.println(sravanicar.calculateCarAgeAndOilChanges());
        
        MarkSharovarovCar carMark = new MarkSharovarovCar("BMW", "Black", 2017);
        System.out.println(carMark.getCarAgeAndNumberOfOilChanges());

        TuckerJonesCar tuckercar = new TuckerJonesCar("Honda", "Insight", "Grey", 2021);
        System.out.println(tuckercar.oilChange());
        
        KalebGoreCar kalebcar = new KalebGoreCar("Suzuki", "Green", "1999");
        System.out.println(kalebcar.numberOfOilChanges());

        AndiaKaranjaCar andiacar = new AndiaKaranjaCar("Toyota", "gold", 1999);
        System.out.println(andiacar.carAgeAndOilChange());

        CaleTonazziCar calecar = new CaleTonazziCar("Ford", "White", 2023);
        System.out.println(calecar.calculateMaintenance());

        JahzaraBroasterCar jahzaracar= new JahzaraBroasterCar("Toyota", "Blue", 2000);
        System.out.println(jahzaracar.CarCalculation());

        CadenOutlandCar cadencar = new CadenOutlandCar("Chevy", "White", 2009);
        System.out.println(cadencar.carAge());

        WilliamAshfordCar williamcar = new WilliamAshfordCar("Lincoln", "Red", 1999);
        System.out.println(williamcar.yearsOld());
    }
}
