public class testi {

    public static void greetings(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        greetings("World");
        greetings("Aurora");
        greetings("Christoph");
        welcomeBack("Aurora");
        welcomeBack("Christoph");
    }
    public static void welcomeBack(String name){
        System.out.println("Willkommen zurück " + name);
    }
}
