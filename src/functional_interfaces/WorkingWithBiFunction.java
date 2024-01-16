package functional_interfaces;

import java.util.function.BiFunction;


public class WorkingWithBiFunction {
    public static void main(String[] args) {
        Person jamila = personMapperBiFunc.apply("Jamila", 18);
        System.out.println(jamila);
    }

    record Person(String name, int age){}
    static BiFunction<String, Integer, Person> personMapperBiFunc = Person::new;
}
