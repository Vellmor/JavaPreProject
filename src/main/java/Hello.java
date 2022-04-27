import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hi! What is your name?");
        String name = new Scanner(System.in).next();
        System.out.printf("Glad to see you, %s!", name);
    }
}
