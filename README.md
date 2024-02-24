
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

The program has a class `Calculator` with a constructor that takes an integer as a parameter.  
The method `add` takes an integer as a parameter and adds it to the value of the calculator.  
If the parameter is a negative number, the method throws an `IllegalArgumentException`.  
The class has a method `sum` that takes two integers as parameters and returns their sum.  
The method `reset`resets the value of the calculator to 0.  
`getValue` method returns the value of the calculator to be used outside the Calculator class.  
