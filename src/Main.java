public class Main {
    public static void main(String[] args) {

        Rational a = new Rational(1, 2);
        Rational b = new Rational(1, 3);

        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " - " + b + " = " + a.sub(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
        System.out.println(a + " / " + b + " = " + a.div(b));
    }
}

class Rational {

    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Rational add(Rational o) {

    }

    private int num;
    private int den;

}