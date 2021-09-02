import org.graalvm.compiler.replacements.StandardGraphBuilderPlugins;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!
        System.out.print("Yo wassup! What is your name?");
        String name = scan.next();
        System.out.println("Hey "+ name + " its nice meeting you!");
        System.out.print("What is one thing people couldn't tell by just looking at you?");
        String fact = scan.next();
        System.out.println("Wow that's very cool!");
        System.out.print("Who is your favorite person from BTS?");
        String bts = scan.next();
        System.out.println("I am disappointed");
        System.out.print("Who is your favorite teacher from Athenian?");
        String teacher = scan.next();
        System.out.println("I like " + teacher + " too!");
        System.out.print("Do you like Jack's Hair.");
        String hair = scan.next();
        System.out.println("Jack's hair is always fantastic");
        scan.close();
    }
}
