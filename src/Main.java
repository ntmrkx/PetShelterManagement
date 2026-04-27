import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Jecna Animal Shelter");

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame(shelter.getShelterName());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null); // center on screen

            //main layout
            frame.setLayout(new BorderLayout());

            //top
            JPanel topBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
            topBar.setBackground(new Color(52, 73, 94));
            JLabel title = new JLabel("  🐾 " + shelter.getShelterName());
            title.setForeground(Color.WHITE);
            title.setFont(new Font("Arial", Font.BOLD, 20));
            topBar.add(title);
            frame.add(topBar, BorderLayout.NORTH);

            //side
            JPanel sidebar = new JPanel();
            sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
            sidebar.setBackground(new Color(44, 62, 80));
            sidebar.setPreferredSize(new Dimension(180, 0));

            String[] navItems = {"Dashboard", "All Animals", "Add Animal", "Adopt", "Health Cards", "Export"};
            for (String item : navItems) {
                JButton btn = new JButton(item);
                btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
                btn.setForeground(Color.WHITE);
                btn.setBackground(new Color(44, 62, 80));
                btn.setBorderPainted(false);
                btn.setFocusPainted(false);
                btn.setFont(new Font("Arial", Font.PLAIN, 14));
                btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
                sidebar.add(btn);
                sidebar.add(Box.createRigidArea(new Dimension(0, 5)));
            }
            frame.add(sidebar, BorderLayout.WEST);

            //panel
            JPanel contentPanel = new JPanel(new BorderLayout());
            contentPanel.setBackground(new Color(236, 240, 241));
            JLabel placeholder = new JLabel("Select a section from the menu", SwingConstants.CENTER);
            placeholder.setFont(new Font("Arial", Font.PLAIN, 16));
            placeholder.setForeground(Color.GRAY);
            contentPanel.add(placeholder, BorderLayout.CENTER);
            frame.add(contentPanel, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}