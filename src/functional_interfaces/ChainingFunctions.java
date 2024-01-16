package functional_interfaces;

import java.util.function.Function;

public class ChainingFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> combinedFunction = incrementByOneFunc.andThen(doubleFunc);
        System.out.println(combinedFunction.apply(1));
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n + 1;

    static Function<Integer, Integer> doubleFunc = n -> n * 2;
}
