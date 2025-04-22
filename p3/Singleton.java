// Classe Singleton
public class Singleton {

    // Campo estático que irá armazenar a instância única
    private static Singleton instance;

    // Construtor privado para impedir a criação de instâncias externas
    private Singleton() {
        System.out.println("Instância Singleton criada!");
    }

    // Método estático para acessar a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}