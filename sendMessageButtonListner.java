/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sendMessageButtonListner extends PrimaryChatbox  {

    public sendMessageButtonListner(String BoxName) {
        super(BoxName);

        class sendMessageButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                if (messageBox.getText().length() < 1) {
                    // do nothing
                } else if (messageBox.getText().equals(".clear")) {
                    chatBox.setText("Cleared all messages\n");
                    messageBox.setText("");
                } else {
                    chatBox.append("<" + BoxName + ">:  " + messageBox.getText()
                            + "\n");
                    messageBox.setText("");
                }
                messageBox.requestFocusInWindow();
            }
        }
    }
}
*/