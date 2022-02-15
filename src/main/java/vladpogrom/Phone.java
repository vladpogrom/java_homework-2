package vladpogrom;

import java.util.Scanner;

public class Phone {
    int capacity;
    boolean face_id;
    boolean nfc;
    String model;
    String color;
    String brand;

    public void printChars() {
        System.out.println("Chars of phone:");
        System.out.println(brand + model);
        System.out.println("Color = " + color);
        System.out.println("Capacity = " + capacity);
        System.out.println("Face_id = " + face_id);
        System.out.println("Nfc = " + nfc);
    }

    public void setBrand() {
        System.out.println("Print brand:");
        Scanner console = new Scanner(System.in);
        brand = console.nextLine();
    }

    public void setModel() {
        System.out.println("Print model:");
        Scanner console = new Scanner(System.in);
        model = console.nextLine();
    }

    public void setColor () {
        System.out.println("Print color:");
        Scanner console = new Scanner(System.in);
        color = console.nextLine();
    }

    public void setCapacity () {
        System.out.println("Print capacity:");
        Scanner console = new Scanner(System.in);
        capacity = console.nextInt();
    }

    public void setNfc () {
        System.out.println("Phone has NFC ?: yes / no");
        Scanner console = new Scanner(System.in);
        String tempNfc = console.nextLine();
        if (tempNfc == "male") {
            nfc = true;
        }
        else {
            nfc = false;
        }
    }

    public void setFaceId () {
        System.out.println("Phone has face id ?: yes / no");
        Scanner console = new Scanner(System.in);
        String tempFace_id = console.nextLine();
        if (tempFace_id == "yes") {
            face_id = true;
        }
        else {
            face_id = false;
        }
    }
}
