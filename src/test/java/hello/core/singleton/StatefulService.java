package hello.core.singleton;

public class StatefulService {

//    private int price;

    public int order(String name, int price) {
        System.out.println("name : " + name + " price : " + price);
//        this.price = price; // problem!!

        return price;
    }

//    public int getPrice() {
//        return price;
//    }

    public static void main(String[] args) {

    }




}
