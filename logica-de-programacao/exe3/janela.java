package exe3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class janela {

    public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(700,700); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(200, 200);

        // usamos este diseño para centrar los componentes de JPanel
        //miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dime tu opinión acerca de Java Swing:   ");

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(5,20); 

        JButton btn = new JButton("Enviar");

        JTextField iptText = new JTextField(3);

        JPasswordField iptPassword = new JPasswordField("salada");

        // conecta los componentes JLabel y JTextField en JPanel
        //miJPanel.add(miJLabel);
        miJPanel.add(miJTextArea);
        miJPanel.add(btn);
        miJPanel.add(iptPassword);
        miJPanel.add(iptText);

        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}