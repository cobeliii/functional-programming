package functional_interfaces;

import java.util.function.Predicate;

public class WorkingWithPredicate {
    public static void main(String[] args) {
        var email = "hello@gmail.com";
        System.out.println(isValidEmail(email));
        System.out.println(isValidEmailPredicate.test(email));
        System.out.println(isValidEmailPredicate.and(containsDotPredicate).test(email));
    }
    static boolean isValidEmail(String email){
        return email.contains("@");
    }

    static Predicate<String> isValidEmailPredicate =
            email -> email.contains("@");

    static Predicate<String> containsDotPredicate =
            email -> email.contains(".");
}
