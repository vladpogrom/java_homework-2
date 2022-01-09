package vladpogrom;

import java.util.Scanner;

public class Cat {
    public enum enumGender {
        MALE,
        FEMALE
    }
    int age;
    boolean isCastrated;
    String name;
    String Gender;
    String color;
    String breed; // порода

    public void printChars() {
        System.out.println("Chars of cat:");
        System.out.println("Gender = " + Gender);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Is castrated = " + isCastrated);
        System.out.println("Color = " + color);
        System.out.println("Breed = " + breed);
    }

    public void setColor() {
        System.out.println("Print color:");
        Scanner console = new Scanner(System.in);
        color = console.nextLine();
    }

    public void setBreed() {
        System.out.println("Print breed:");
        Scanner console = new Scanner(System.in);
        breed = console.nextLine();
    }

    public void setName() {
        System.out.println("Print name:");
        Scanner console = new Scanner(System.in);
        name = console.nextLine();
    }

    public void setAge() {
        System.out.println("Print age:");
        Scanner console = new Scanner(System.in);
        age = console.nextInt();
    }

    public void setGender() {
        System.out.println("Print gender: male / female");
        Scanner console = new Scanner(System.in);
        String tempGender = console.nextLine();
        if (tempGender == enumGender.MALE.name()) {
            Gender = enumGender.MALE.name();
        }
        else {
            Gender = enumGender.FEMALE.name();
        }
    }

    public void setIsCastrated() {
        System.out.println("Print castrated or not: yes / no");
        Scanner console = new Scanner(System.in);
        String tempIs_castrated = console.nextLine();
        if (tempIs_castrated == "yes") {
            isCastrated = true;
        }
        else {
            isCastrated = false;
        }
    }
}
