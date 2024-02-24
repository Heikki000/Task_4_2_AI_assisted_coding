import static java.lang.Double.sum;
public class Calculator {
    private int value = 0;

    public Calculator(int value) {
        this.value = value;
    }
    public void reset() {
        value = 0;
    }
    public void add(int number) {
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Only positive values are allowed");
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Adding " + number + " to calculator.");
        value += number;
    }

    public int getValue() {
        return value;
    }

    //a method to sum integers
    public int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args){
        Calculator calc = new Calculator(0);

        calc.add(5);
        calc.add(7);
        calc.add(3);
        calc.add(6);
        System.out.println("The sum is: " + calc.getValue());
        calc.reset();

        System.out.println("5 + 7 = " + calc.sum(5, 7));

    }
}