package Anima;

public class MainZoo {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Monica");

        dog1.move();
        dog1.eat();
        dog1.warmFur();
        dog1.cleanFur("Short fur");

        dog2.eat(dog2.name);
        dog2.setHomeAddress("France, Paris");

        System.out.println(dog2.name + " live in " + dog2.getHomeAddress() + " and has collar " + dog2.isCollar());
        System.out.println(dog1.name + " live in " + dog1.getHomeAddress() + " and has collar " + dog1.isCollar());

        Cat cat = new Cat("Murzik");

        cat.move();
        cat.eat();
        cat.warmFur();
        cat.cleanFur("Long fur");
        cat.climbUp();

        Wolf wolf = new Wolf();
        wolf.move();
        wolf.hunter("Rabbit");
        wolf.warmFur();
        wolf.cleanFur("Short fur");

    }

}

