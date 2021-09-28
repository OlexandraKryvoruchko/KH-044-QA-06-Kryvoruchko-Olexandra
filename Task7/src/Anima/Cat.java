package Anima;

public class Cat extends HomeAnimal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    void move() {
        System.out.println("Cat moves");
    }

    void move(String name) {
        System.out.println("Cat moves");
    }
}
