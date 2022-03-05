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

        /*
                public void display() {
                        JPanel mainPanel = new JPanel();
                        mainPanel.setLayout(new BorderLayout());

                        JPanel southPanel = new JPanel();
                        southPanel.setBackground(Color.BLUE);
                        southPanel.setLayout(new GridBagLayout());

                        messageBox = new JTextField(30);
                        messageBox.requestFocusInWindow();

                        sendMessage = new JButton("Send Message");
                        sendMessage.addActionListener(new sendMessageButtonListener());

                        chatBox = new JTextArea();
                        chatBox.setEditable(true);
                        chatBox.setFont(new Font("Serif", Font.PLAIN, 15));
                        chatBox.setLineWrap(true);

                        mainPanel.add(new JScrollPane(chatBox), BorderLayout.CENTER);

                        GridBagConstraints left = new GridBagConstraints();
                        left.anchor = GridBagConstraints.LINE_START;
                        left.fill = GridBagConstraints.HORIZONTAL;
                        left.weightx = 512.0D;
                        left.weighty = 1.0D;

                        GridBagConstraints right = new GridBagConstraints();
                        right.insets = new Insets(0, 10, 0, 0);
                        right.anchor = GridBagConstraints.LINE_END;
                        right.fill = GridBagConstraints.NONE;
                        right.weightx = 1.0D;
                        right.weighty = 1.0D;

                        southPanel.add(messageBox, left);
                        southPanel.add(sendMessage, right);

                        mainPanel.add(BorderLayout.SOUTH, southPanel);

                        newFrame.add(mainPanel);
                        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        newFrame.setSize(470, 300);
                        newFrame.setVisible(true);
                }
*/
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

