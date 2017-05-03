package homework;

import java.util.Scanner;

/**
 * Created by prots on 03.05.2017.
 */
public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 20;
        String question1 = "What is your name?", question2 = "Where are your live, ", name, address;
        name = scanner.nextLine();
        System.out.println(question1);
        System.out.println(question2+name+"?");
        address = scanner.nextLine();
        System.out.println("My name is "+name+'\n'+"I live in "+address+'\n'+"I'm old "+age);
    }
}
