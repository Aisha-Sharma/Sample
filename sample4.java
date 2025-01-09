public class DefectiveFraction {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(-4, 8);
        
        System.out.println("Result: " + fraction);  
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);  
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
