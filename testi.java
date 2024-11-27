public class testi {

    public static void greetings(String name){
        System.out.println("Hello "+name);
    }

    public static void goodbye(){
        System.out.println("Goodbye vielen Dank ");
    }

    public static void main(String[] args) {
        greetings("World");
        greetings("Aurora");
        greetings("Christoph");
        welcomeBack("Aurora");
        welcomeBack("Christoph");
        goodbye();
    }
    public static void welcomeBack(String name){
        System.out.println("Willkommen zurück " + name);

>>>>>>> 7b3f83e8027e30e22de7d71162fec29a32364791
    }
}
