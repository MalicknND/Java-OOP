package advanced;

/*Advanced Classes and Objects - Initialization blocks*/

public class InitializationExample {

    int instanceVariable;       // Variable d'instance (différente pour chaque objet)
    static int staticVariable;  // Variable statique (commune à tous les objets)

    // 🔄 Bloc d'initialisation d'instance :
    // S'exécute à chaque fois qu'un objet est créé.
    {
        instanceVariable = 100;
    }

    // 🧷 Bloc d'initialisation statique :
    // S'exécute une seule fois, au moment du chargement de la classe.
    static {
        staticVariable = 200;
    }

    public static void main(String[] args) {
        InitializationExample example = new InitializationExample(); // Création d'un objet => bloc d'instance exécuté
        System.out.println("Instance Variable: " + example.instanceVariable);  // Affiche 100
        System.out.println("Static Variable: " + staticVariable);              // Affiche 200
    }
}
