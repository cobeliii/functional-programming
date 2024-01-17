package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static streams.WorkingWithStreams.Gender.*;

public class WorkingWithStreams {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aishia", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet()).forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    static enum Gender{
        MALE,
        FEMALE
    }
}
