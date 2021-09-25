package Anima;

public class Cat extends Pets implements IFur, IClimbUp {
    public Cat (String name ){
        this.name = name;
    }


    @Override
    void move() {
        System.out.println("Cat moves");
    }
    void move (String name){
        System.out.println("Cat moves");
    }

    @Override
    public void warmFur() {
        System.out.println("Warm warm");

    }

    @Override
    public void cleanFur(String furLength){
        IFur.super.cleanFur(furLength);
    }

    @Override
    public void climbUp() {
        System.out.println("Cat climb tree");

    }


}
