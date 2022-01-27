import java.util.ArrayList;
import java.util.List;

public class Exception extends Throwable {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("b");
        list.add("c");

        try{
            System.out.println(list.get(7));
        }catch (MyCustonException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally for string");
        }



       /* }
        try{
            System.out.println(list.get(7));
        }catch (java.lang.Exception e) {
            System.out.println(e.getMessage());
        }*/

    }

    }
