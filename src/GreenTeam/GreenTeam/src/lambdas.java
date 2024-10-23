import java.util.function.Function; 
import java.util.function.BiFunction;
//import java.util.function.TriFunction; import dne  

public class lambdas {

    //contains 4 separate classes in this document

    //class 1 - quadratic formula: bifunction Lambda Expression 

    //class 2 - pythagorean theorem: bi function lambda expresion 

    //class 3 - sum of arithmetic progression: trifunction lambda expression 
 
    //class 4 - area of a circle: function lambda expression

    //lamdba expressions are defined as Java functional Interfaces
    //tri/bi/non - take one or more inputs and produce an output based on the
    //formula provided 
    
    //also have to build a main method in this one 

    //class 1 - should be a trifunction? 
    public class lambdaQuadratic{   
        static int c = 0;
        public static BiFunction<Double, Double, Double>
        lambdaquadratic = (a, b) -> Math.pow(b,2) - 4 *a * c;
    //TODO infill later - how to do quadratic eqn  while missing one whole variable?  
    //TODO change entire piece later because this just isn't right 
        
    }
    //class 2
    public class lambdaPythagorean{
        public static BiFunction<Integer, Integer, Double>
        quadraticLambda = (a,b) -> Math.sqrt((a*a) + (b*b));

    }
    //class 3 
    public class lambdaArithmeticProgression{
        public static TriFunction<Integer, Integer, Integer, Integer> 
        arithmeticLambda = (n, a1, n) -> n * (a1 + an)/2; 
    }

    //class 4
    public class lambdaArea{
        public static Function <Integer, Double>
        circleAreaLambda = (r) -> (Math.PI)*(r)*(r); 
    }

}
    
