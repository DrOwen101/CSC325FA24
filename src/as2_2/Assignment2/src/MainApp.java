public class MainApp {
    public static void main(String[] args) throws Exception {

        justiceNobackAS2d justiceClass = new justiceNobackAS2d();
        String result = justiceClass.loopExecute();
        System.out.println("Justice Noback - " + result);

        AlanaGarciaAS2d alanasClass = new AlanaGarciaAS2d();
        // String result = alanasClass.loops();
        System.out.println("Alana Garcia - " + alanasClass.loops());

        JacksonBradleyAS2d jacksonBClass = new JacksonBradleyAS2d();
        String  resultJB = jacksonBClass.loops();
        System.out.println("Jackson Bradley - "+ resultJB);
        
        KalebGoreAS2d obj = new KalebGoreAS2d();
        System.out.println("Kaleb Gore - While Loop Result: " + obj.whileLoop() + " - For Loop Result: " + obj.forLoop());

        EthanSextonAS2d ethanSextonTest = new EthanSextonAS2d();
        System.out.println("Ethan Sexton - While Loop: " + ethanSextonTest.whileLoop() + "\nFor Loop: " + ethanSextonTest.forLoop());

        MarkSharovarovAS2d testMark = new MarkSharovarovAS2d();
        System.out.println("Mark Sharovarov - " + testMark.loopsMethod());

        JadaCarterAS2d ob = new JadaCarterAS2d();
        System.out.println(ob.getIterationsAndCounts());

        TuckerJonesAS2d tucker = new TuckerJonesAS2d();
        System.out.println("Tucker Jones - " + tucker.wLoop() + "\n" + tucker.fLoop());

        BrooklynWellsAS2d bLoops = new BrooklynWellsAS2d();
        System.out.println("Brooklyn Wells - " + bLoops.funWithLooops());

        JadaCarterAS2d ob = new JadaCarterAS2d();
        System.out.println(ob.getIterationsAndCounts());
        
        EmiliaKubikAS2d emiliaKubikTest = new EmiliaKubikAS2d();
        System.out.println("Emilia Kubik- While-loop: " + emiliaKubikTest.searchArray() + "\nFor-loop: " + emiliaKubikTest.Counter());
    
        LandonWebbAS2d theLoops = new LandonWebbAS2d();
        System.out.println("Landon Webb- While loop" +theLoops.whileLoop() +"\n" + "The for loop" + theLoops.forLoop() );

        // /*TraceHookCar tracecar = new TraceHookCar("Chevy", "Black", 2008);
        // System.out.println(tracecar.calculateCarAgeAndOilChanges());

        // JacksonBradleyCar jacksoncar = new JacksonBradleyCar("Ford", "Blue", 1989);
        // System.out.println(jacksoncar.oilChangeNeeded());

        // AlanaGarciaCar alanacar = new AlanaGarciaCar("Honda", "Accord", "Yellow", 2020);
        // System.out.println(alanacar.calculateCarAgeAndOilChange());
        
        // ethanFowlerCar ethancar = new ethanFowlerCar("Suzuki", "Green", 1999);
        // System.out.println(ethancar.yearsOld());

        // EmiliaKubikCar emiliacar = new EmiliaKubikCar("Suzuki", "Green", 1999);
        // System.out.println(emiliacar.carAge());

        // AbbieGeorgeCar abbiecar = new AbbieGeorgeCar("Ford", "White", 2014);
        // System.out.println(abbiecar.carYearCalculator());

        //EthanSextonCar ethanscar = new EthanSextonCar("Suzuki", "Green", 1999);
        //System.out.println(ethanscar + "\n" + ethanscar.getOil(ethanscar.getYear()));

        // JahzaraBroasterCar car= new JahzaraBroasterCar("Toyota", "Blue", 2000);
        // System.out.println(car.CarCalculation());

        //BrooklynWellsCar brooklynCar = new BrooklynWellsCar("Acura", "Red", 1990);
        //System.out.println(brooklynCar.oilChange());
      
        // MarkSharovarovCar markCar = new MarkSharovarovCar("BMW", "Black", 2015);
        // System.out.println(markCar.getCarAgeAndNumberOfOilChanges());

        // SravaniKadiyalaCar sravanicar = new SravaniKadiyalaCar("Ford Fusion", "Gold", 2019);
        // System.out.println(sravanicar.calculateCarAgeAndOilChanges());
        
        // MarkSharovarovCar carMark = new MarkSharovarovCar("BMW", "Black", 2017);
        // System.out.println(carMark.getCarAgeAndNumberOfOilChanges());

        // TuckerJonesCar tuckercar = new TuckerJonesCar("Honda", "Insight", "Grey", 2021);
        // System.out.println(tuckercar.oilChange());
        
        // KalebGoreCar kalebcar = new KalebGoreCar("Suzuki", "Green", "1999");
        // System.out.println(kalebcar.numberOfOilChanges());

        // AndiaKaranjaCar andiacar = new AndiaKaranjaCar("Toyota", "gold", 1999);
        // System.out.println(andiacar.carAgeAndOilChange());

        // CaleTonazziCar calecar = new CaleTonazziCar("Ford", "White", 2023);
        // System.out.println(calecar.calculateMaintenance());

        // JacksonCashCar jcashcar=new JacksonCashCar("Dodge", "Grey", 2020);
        // System.out.println(jcashcar.getOCCount());

        // CadenOutlandCar cadencar = new CadenOutlandCar("Chevy", "White", 2009);
        // System.out.println(cadencar.carAge());

        // WilliamAshfordCar williamcar = new WilliamAshfordCar("Lincoln", "Red", 1999);
        // System.out.println(williamcar.yearsOld());

        // JusticeNobackCar justicecar = new JusticeNobackCar("Porsche", "Black", 2020);
        // System.out.println(justicecar.ageAndOilChange());

        // // TristanCodayCar tristancodaycar = new TristanCodayCar("Ferrari", "Red", 2020);
        // // System.out.println(tristancodaycar.calCarAgeandOilChanges());

        // // TrinityNobleCar trinitycar = new TrinityNobleCar("Mazeradi", "Blue", 2012);
        // // System.out.println(trinitycar.Calculations(CurrentYear))

        // koenTannerCar koencar = new koenTannerCar("Chevy", "Red", 2021);
        // System.out.println(koencar.ageAndOilChange());

        // LandonWebbCar landoncar = new LandonWebbCar("Ford", "Blue", 1992);
        // System.out.println(landoncar.calculateCarAgeAndOilChanges());

    }
}
