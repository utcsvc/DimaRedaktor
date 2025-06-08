import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class DimaRedaktor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DimaRedaktor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(770, 770);
        //frame.setBo
        JTextArea textArea = new JTextArea();


        Font baseFont = new Font("Consolas", Font.PLAIN, 16);
        Map<TextAttribute, Object> attributes = (Map<TextAttribute, Object>) baseFont.getAttributes();
        attributes.put(TextAttribute.TRACKING, 0.1); 
       // attributes.put(TextAttribute.TRACKING_LOOSE, 0.1);
        Font fontWithTracking = baseFont.deriveFont(attributes);
        textArea.setFont(fontWithTracking);


        textArea.setBackground(Color.DARK_GRAY);
        textArea.setForeground(Color.WHITE);

        textArea.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);


        frame.setVisible(true);
    }
}
