import javax.swing.*;
import java.awt.*; 

public class MainApp extends JFrame {

    public MainApp() {
     
        setTitle("Aplicação Gráfica");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); 

   
        String[] options = {"Opção 1", "Opção 2", "Opção 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        JCheckBox checkBox = new JCheckBox("Aceitar termos");
        JTextField textField = new JTextField(15);
        JButton btnSalvar = new JButton("Salvar");
        JButton btnSair = new JButton("Sair");

       
        add(comboBox);
        add(checkBox);
        add(textField);
        add(btnSalvar);
        add(btnSair);

     
        setVisible(true);
    }

    public static void main(String[] args) {
       
        new MainApp();
    }
}
