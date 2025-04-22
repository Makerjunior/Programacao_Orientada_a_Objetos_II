public class MainApp {

    public static void main(String[] args) {
        // Criando duas referências para a instância Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();


        // Verificando se as referências são iguais
       System.out.println("As referências são iguais? ");
       System.out.println((singleton1 == singleton2) );

    }
}