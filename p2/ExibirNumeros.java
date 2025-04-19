class ExibirNumeros implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
            try {
                Thread.sleep(1000); // Intervalo de 1 segundo
               
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrompida");
            }
            
        }
    }
}