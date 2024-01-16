package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class WorkingWithConsumer {
    public static void main(String[] args) {
        //sendEmail("hello@hotmail.com");
        sendEmailConsumer.accept("hello@gmail.com");
        List<String> emails = List.of("hi@gmail.com", "hey@gmail.com", "ola@gmail.com");
        emails.forEach(WorkingWithConsumer::sendEmail);
    }

    static void sendEmail(String email){
        System.out.println("Sending email to " +email);
    }

    static Consumer<String> sendEmailConsumer = email -> System.out.println("Sending email to " +email);
}
