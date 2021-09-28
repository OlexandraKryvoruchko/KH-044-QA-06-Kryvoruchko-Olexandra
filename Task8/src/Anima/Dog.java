package Anima;

public class Dog extends Pets implements IFur{
    private boolean collar = false;
    private String homeAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public boolean isCollar() {
        return collar;
    }

    private void setCollar(boolean collar) {
        this.collar = collar;
    }
    public Dog(String name) {
        this.name = name;
        setCollar(true);
    }

    public Dog() {

    }

    public void eat(String name) {
        System.out.println(name + " eats");
    }

    @Override
    void move() {
        System.out.println("Dog moves");
    }
    @Override
    void eat() {
        System.out.println("Pet eats");
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
