public class Gauss {

    public static void main(String[] args) {
        System.out.println(gauss(1, 10));   
        System.out.println(gauss(0, 5));  
        System.out.println(gauss(2, 20));   
    }

    public static double gauss(double x, int n) {
        double term = 1;  
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + term;   
            term = term * (-x * x) / i;
		}
        return sum;
    }
}
