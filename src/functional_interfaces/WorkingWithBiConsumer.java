package functional_interfaces;

import java.util.function.BiConsumer;

public class WorkingWithBiConsumer {
    public static void main(String[] args) {
        sendingEmailConsumer.accept("hello@gmail.com", "ola@gmail.com");
    }

    static BiConsumer<String,String> sendingEmailConsumer =
            (from, to) -> System.out.printf("Sending email from %s to %s%n", from, to);
}
