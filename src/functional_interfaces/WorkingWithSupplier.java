package functional_interfaces;

import java.util.function.Supplier;

public class WorkingWithSupplier {
    public static void main(String[] args) {
        System.out.println(getUrlSupplier.get());
    }

    static Supplier<String> getUrlSupplier =
            () -> "https://google.com";
    static String getUrl(){
        return "https://google.com";
    }
}
