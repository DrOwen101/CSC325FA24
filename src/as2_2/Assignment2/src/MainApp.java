public class MainApp {
    public static void main(String[] args) throws Exception {
        TraceHookCar tracecar = new TraceHookCar("Chevy", "Black", 2008);
        System.out.println(tracecar.calculateCarAgeAndOilChanges());

        JacksonBradleyCar jacksoncar = new JacksonBradleyCar("Ford", "Blue", 1989);
        System.out.println(jacksoncar.oilChangeNeeded());

        
    }
}
