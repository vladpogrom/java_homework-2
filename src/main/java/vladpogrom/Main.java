package vladpogrom;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // cat
        Cat bread = new Cat ();
        bread.setGender();
        bread.setIsCastrated();
        bread.setColor();
        bread.setBreed();
        bread.setName();
        bread.setAge();
        bread.printChars();

        // phone
        Phone pixel = new Phone();
        pixel.setBrand();
        pixel.setModel();
        pixel.setCapacity();
        pixel.setColor();
        pixel.setNfc();
        pixel.setFaceId();
        pixel.printChars();
    }
}
