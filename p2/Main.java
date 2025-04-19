

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes Runnable
        ExibirNumeros thread1 = new ExibirNumeros();
        ExibirMensagens thread2 = new ExibirMensagens();
        
        // Criando objetos Thread para rodar as tarefas simultaneamente
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        // Iniciando as threads
   
        t1.start();
        t2.start();
   
    }
}