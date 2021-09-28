package Anima;

public class Wolf extends Animal {
    @Override
    void move() {
        System.out.println("Wolf moves");
    }

    public void hunter(String animal) {
        System.out.println("Wolf eats " + animal);
    }
}
