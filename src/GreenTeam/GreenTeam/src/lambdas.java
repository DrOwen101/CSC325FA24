import java.util.function.Function;
import java.util.function.BiFunction;


public class lambdas { 
    //trifunction interface doesn't exist so we build one
    interface TriFunction<T, U, V, R>{
        R apply (T t, U u, V v);
    }

    //class 1 - takes in the three coefficients on polynomials of quadratic eqn
    //and calculates the roots of the polynomial
    public static class lambdaQuadratic {
		public static TriFunction<Double, Double, Double, Double[]> calculateQuadratic = (a, b, c) -> {
			double discriminant = Math.sqrt(b * b - 4 * a * c);
			double root1 = (-b + discriminant) / (2 * a);
			double root2 = (-b - discriminant) / (2 * a);
			return new Double[] { root1, root2 };
		};
	} 
        
    
    //class 2 - takes in two vectors and calculates the magnitude/ 
    //also known as the hypotenuse of a triangle
    public class lambdaPythagorean{
        public static BiFunction<Integer, Integer, Double>
        pythagoreanLambda = (a,b) -> Math.sqrt((a*a) + (b*b));
    }
    //class 3  - calculates the arithmetic progression of two numbers
    public class lambdaArithmeticProgression{
        public static TriFunction<Integer, Integer, Integer, Integer> 
        arithmeticLambda = (n, a1, an) -> n * (a1 + an)/2; 
    }

    //class 4 - calculates the area of a circle based on input radius
    public class lambdaArea{
        public static Function <Integer, Double>
        circleAreaLambda = (r) -> (Math.PI)*(r)*(r); 
    }

    public static void main(String[] args){
        //random input ints 
        int a = 12; 
        int b = 13; 
        int c = 14; 

        //tests lambda classes 
        Double[]  quadraticResult = lambdaQuadratic.calculateQuadratic.apply(1.0, 2.5, 3.9);
        double pythagoreanResult = lambdaPythagorean.pythagoreanLambda.apply(a,b);
        double arithmeticResult = lambdaArithmeticProgression.arithmeticLambda.apply(a, b, c);
        double areaResult = lambdaArea.circleAreaLambda.apply(a);

        //printing eqn results
        System.out.println("Result of lambdaQuadratic: " + "Root 1: " + quadraticResult[0] + " Root 2: " + quadraticResult[1]);
        System.out.println("Result of lambdaPythagorean: " + pythagoreanResult);
        System.out.println("Result of lambdaArea: " + areaResult);
        System.out.println("Result of lambdaArithmeticProgression: " + arithmeticResult);

    }

}
    
