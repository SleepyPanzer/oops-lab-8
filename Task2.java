class Card {
    void greeting(){
        System.out.println("Greetings");
    }
}
class holiday extends Card{
    void greeting(){
    System.out.println("Seasons Greetings");}
}
class birthday extends Card{
    void greeting(){
    System.out.println("Happy Birthday");}
}
class valentine extends Card{
    void greeting(){
        System.out.println("Happy Valentine Day");
    }
}
public class Task2{
    public static void main(String[] args) {
    holiday g1 = new holiday();
    birthday g2 = new birthday();
    valentine g3 = new valentine();
    g1.greeting();
    g2.greeting();
    g3.greeting();
}
}