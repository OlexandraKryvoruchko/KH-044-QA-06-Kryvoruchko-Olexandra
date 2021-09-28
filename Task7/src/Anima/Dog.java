package Anima;

public class Dog extends HomeAnimal {
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
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    void move() {
        System.out.println("Dog moves");
    }
}
