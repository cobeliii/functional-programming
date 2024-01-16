package functional_interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WorkingWithFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOne(1));
        System.out.println(incrementByOneFunc.apply(1));

        List<Integer> integers = List.of(1, 2, 3).stream().map(WorkingWithFunction::incrementByOne).collect(Collectors.toList());
        System.out.println(integers);
    }

    static Function<Integer, Integer> incrementByOneFunc = n -> n + 1;

    static int incrementByOne(int n){
        return n + 1;
    }
}
