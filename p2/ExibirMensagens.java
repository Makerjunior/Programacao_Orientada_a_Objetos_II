class ExibirMensagens implements Runnable {
    @Override
    public void run() {
        String[] mensagens = {"Mensagem A", "Mensagem B", "Mensagem C", "Mensagem D"};
        int i = 0;
        while (i < mensagens.length) {

    
            try {
                Thread.sleep(2000); // Intervalo de 2 segundos
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrompida");
            }
        System.out.println("Mensagem: " + mensagens[i]);
        i++;
        }
    }
}