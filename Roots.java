public class SquareRoot {

   public static void main(String[] args) {
        System.out.println(squareRoot(9));  
        System.out.println(squareRoot(4));   
        System.out.println(squareRoot(100));  
        System.out.println(squareRoot(0));  
    }
    
    public static double squareRoot(double a) {
        if (a == 0) {
            return 0;                      
        }

        double x0 = a / 2;                 
        double x1 = (x0 + a / x0) / 2;     
        
        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;                       
            x1 = (x0 + a / x0) / 2;        
        }
        return x1;
    }
}
