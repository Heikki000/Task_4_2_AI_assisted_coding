
# Readme.md

## Calculator Program

The idea of the program is a simple calculator  
that can sum positive integers.

```
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
}
```