package firstObject;

//Create a Class/Object of Dog
class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.print("Woof Woof");
    }
}

public class DogTestDrive {
    public static void main(String args[]) {
        Dog germanShepard = new Dog();
        germanShepard.size = 40;
        germanShepard.bark();
    }
}
