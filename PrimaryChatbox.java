import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimaryChatbox {

        String BoxName, userName;
        PrimaryChatbox PrimaryChatbox;
        JFrame newFrame;
        JButton sendMessage;
        JTextField messageBox;
        JTextArea chatBox;


        public PrimaryChatbox(String BoxName) {
                newFrame = new JFrame(BoxName);
                newFrame.setTitle(BoxName);
                userName = BoxName;
        }

   
        public class sendMessageButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent event) {
                        if (messageBox.getText().length() < 1) {
                                // do nothing
                        } else if (messageBox.getText().equals(".clear")) {
                                chatBox.setText("Cleared all messages\n");
                                messageBox.setText("");
                        } else {
                                chatBox.append("<" + userName + ">:  " + messageBox.getText()
                                        + "\n");
                                messageBox.setText("");
                        }
                        messageBox.requestFocusInWindow();
                }

        }

}

