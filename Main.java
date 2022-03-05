import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String [] args){

        PrimaryChatbox michael = new PrimaryChatbox("Michael");
        display michael1 = new display("Michael");

        PrimaryChatbox merp = new PrimaryChatbox("merp");
        display merp1 = new display("merp");

    }
}
