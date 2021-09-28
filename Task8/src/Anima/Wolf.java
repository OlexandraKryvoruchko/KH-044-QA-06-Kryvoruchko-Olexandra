package Anima;

public class Wolf extends Animal implements IFur {
    @Override
    void move (){
        System.out.println("Wolf moves");
    }

    public void hunter(String animal) {
        System.out.println("Wolf eats " + animal);
    }


    @Override
    public void warmFur() {
        System.out.println("Warm warm");
    }

    @Override
    public void cleanFur(String furLength) {
        IFur.super.cleanFur(furLength);
    }
}
