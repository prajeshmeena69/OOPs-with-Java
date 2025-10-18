package Unit_2;

import java.util.*;
import java.util.function.*;

public class Builtin_Functional_Interface_Example {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<String> display = msg -> System.out.println(msg);
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println("Is 8 even? " + isEven.test(8));
        System.out.println("Square of 5: " + square.apply(5));
        display.accept("Hello Functional Interface!");
        System.out.println("Random number: " + randomValue.get());
    }
}
