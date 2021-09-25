package Anima;

public interface IFur {
    String color = "Different fur color";

    void warmFur();

    default void cleanFur(String furLength){
        System.out.println("Animal cleans fur");
    }

}

