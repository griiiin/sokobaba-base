import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Dungeon_Crawler extends JFrame {

    private JLabel ImageLabel;
    private JPanel MainPanel;
    private JTextArea textArea1;
    private JLabel titleLabel;
    private JTextField inputCommantTextArea;
    private JTextArea LogTextArea;
    private JButton sendButton;
    private JScrollBar scrollBar1;
    private JTabbedPane tabbedPane1;

    Dungeon_Crawler(){

        // MainPanel ang pinaka parent nga panel

        MainPanel = new JPanel();
        MainPanel.setLayout(null); // gamit ani kay e disarrange tanan object sa .form

        Color color = new Color(38,27,44);
        Color textColor = new Color(38, 27,44);
        Color inputColor = new Color(80, 76,99);
        Color white = new Color(151, 157,179);
        MainPanel.setBackground(color); // set bg color

        // dili ka ka add ug images sa JFrame so we use JLabel's add ICON feature.
        // ths is the main window of the game
        ImageIcon image = new ImageIcon("main_lvl.jpg");
        // ang directory sa img kay e butang sa IdeaProjects since mao na ang root directory
        Border border = BorderFactory.createLineBorder(Color.lightGray,3);

        ImageLabel.setIcon(image); // e set ang main_lvl.jpg to the JLabel icon
        ImageLabel.setBorder(border); // add border
        ImageLabel.setBackground(Color.black); // redundant rani kay matabunan gehapon sa img
        ImageLabel.setBounds(4,72, 400, 320); //location and size
        // end of main window of the game

            // Title image above the frame
            ImageIcon imagetitle = new ImageIcon("title.jpg"); // para ni sa F2's Dungeon Crawler

            titleLabel.setIcon(imagetitle);
            titleLabel.setBorder(border);
            titleLabel.setBackground(Color.black);
            titleLabel.setBounds(4,4, 806, 64);
            // end of title image on top of the frame.

/*
        textArea1.setBounds(4,72,400,400);
        textArea1.setOpaque(false); // make the background disappear
        textArea1.setFont(new Font("Calibri", Font.PLAIN, 14));
        textArea1.setForeground(textColor);
*/

            LogTextArea.setBounds(409, 72, 400,350);
            LogTextArea.setBorder(border);
            LogTextArea.setForeground(white);
            LogTextArea.setBackground(inputColor);
            LogTextArea.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 14));

        inputCommantTextArea.setBounds(409, 427, 340, 35);
        inputCommantTextArea.setBorder(border);
        inputCommantTextArea.setForeground(white);
        inputCommantTextArea.setBackground(inputColor);
        inputCommantTextArea.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 14));

            sendButton.setBounds(754, 427, 54, 35);
            sendButton.setBackground(color);
            sendButton.setForeground(white);
            sendButton.setBorder(border);
            sendButton.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 14));

        tabbedPane1.setBounds(4, 396, 400, 170);
        tabbedPane1.setBorder(border);
        tabbedPane1.setForeground(white);
        tabbedPane1.setBackground(inputColor);
        tabbedPane1.setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 14));

        // to make the JTextArea and JLabel layer so that we can visualize using text.
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(820, 500));

        //add the components and layer them by number konohay
        MainPanel.add(titleLabel, Integer.valueOf(0));
        //MainPanel.add(textArea1, Integer.valueOf(1));
        MainPanel.add(ImageLabel, Integer.valueOf(2));
        MainPanel.add(LogTextArea, Integer.valueOf(3));
        MainPanel.add(inputCommantTextArea, Integer.valueOf(4));
        MainPanel.add(sendButton, Integer.valueOf(5));
        MainPanel.add(tabbedPane1, Integer.valueOf(6));
        // add them all to the mainPanel to print on the psvm
        MainPanel.add(layeredPane);
    }

    public static void main(String[] args) {
        Dungeon_Crawler frame = new Dungeon_Crawler();

        frame.setContentPane(frame.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(828,608);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
