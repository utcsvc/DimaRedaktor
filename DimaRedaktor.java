import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class dimaredaktor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DimaRedaktor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(770, 770);
        JTextArea text = new JTextArea();

        
        Font baseFont = new Font("Consolas", Font.PLAIN, 16);
        Map<TextAttribute, Object> attributes = (Map<TextAttribute, Object>) baseFont.getAttributes();
        attributes.put(TextAttribute.TRACKING, 0.1); 
        Font fontWithTracking = baseFont.deriveFont(attributes);
        textArea.setFont(fontWithTracking);


        text.setBackground(Color.DARK_GRAY);
        text.setForeground(Color.WHITE);

        text.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);


        frame.setVisible(true);
    }
}
