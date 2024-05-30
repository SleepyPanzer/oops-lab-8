class Food {
    Food() {
        System.out.println("Food class\n");
    }
}
class Fruit extends Food {
    Fruit(String fill) {
        System.out.println("Fruit class\n");
    }
    Fruit() {
        super();
        System.out.println("Fruit class\n");
    }
}
class Apple extends Fruit {
    Apple(String fill) {
        System.out.println("Apple class\n");
    }
    Apple() {
        super();
        System.out.println("Apple class\n");
    }
}
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Printing individual constructors! ");
        Food food = new Food();
        Fruit fruit = new Fruit("Individual");
        Apple apple = new Apple("Individual");

        System.out.println("Printing all three constructors! ");
        Fruit all = new Apple();
    }
}