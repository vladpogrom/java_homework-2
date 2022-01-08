package vladpogrom;

import java.util.Scanner;

public class Cat {
    int age;
    boolean is_castrated;
    String name;
    boolean gender; // 0 - female, 1 - male
    String color;
    String breed; // порода

    public void printChars() {
        System.out.println("Chars of cat:");
        System.out.println("Gender = " + gender);
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Is castrated = " + is_castrated);
        System.out.println("Color = " + color);
        System.out.println("Breed = " + breed);
    }

    public void setColor () {
        System.out.println("Print color:");
        Scanner console = new Scanner(System.in);
        color = console.nextLine();
    }

    public void setBreed () {
        System.out.println("Print breed:");
        Scanner console = new Scanner(System.in);
        breed = console.nextLine();
    }

    public void setName () {
        System.out.println("Print name:");
        Scanner console = new Scanner(System.in);
        name = console.nextLine();
    }

    public void setAge () {
        System.out.println("Print age:");
        Scanner console = new Scanner(System.in);
        age = console.nextInt();
    }

    public void setGender () {
        System.out.println("Print gender: male / female");
        Scanner console = new Scanner(System.in);
        String tempGender = console.nextLine();
        if (tempGender == "male") {
            gender = true;
        }
        else {
            gender = false;
        }
    }

    public void setIs_castrated () {
        System.out.println("Print castrated or not: yes / no");
        Scanner console = new Scanner(System.in);
        String tempIs_castrated = console.nextLine();
        if (tempIs_castrated == "yes") {
            is_castrated = true;
        }
        else {
            is_castrated = false;
        }
    }
}
