package advanced;

public class OuterClass {

    // ✅ Classe statique imbriquée
    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    // ✅ Classe interne (non statique)
    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    // ✅ Classe locale (définie à l'intérieur d'une méthode)
    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }

        // ✅ Instanciation de la classe locale et appel de la méthode
        LocalInnerClass local = new LocalInnerClass();
        local.printMessage();
    }

    public static void main(String[] args) {

        // ✅ 1. Classe imbriquée statique
        StaticNestedClass staticNested = new StaticNestedClass();
        staticNested.printMessage();

        // ✅ 2. Classe interne (besoin de créer une instance de OuterClass d'abord)
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        inner.printMessage();

        // ✅ 3. Appel de la méthode qui utilise la classe locale
        outer.displayLocalClassMessage();
    }
}
