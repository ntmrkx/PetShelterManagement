package UI;

import javax.swing.*;
import java.awt.*;

import Base.*;
import Records.*;
import AnimalTypes.*;

public class DashboardPanel extends JPanel {

    public DashboardPanel(Shelter shelter) {
        setLayout(new BorderLayout());
        setBackground(new Color(236, 240, 241));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // --- TITLE ---
        JLabel title = new JLabel("Dashboard");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        add(title, BorderLayout.NORTH);

        // --- CARDS GRID ---
        JPanel cards = new JPanel(new GridLayout(2, 2, 15, 15));
        cards.setBackground(new Color(236, 240, 241));

        // get data from shelter
        Pet newest = shelter.getNewestPet();
        AdoptionRecord lastAdoption = shelter.getLastAdoption();
        int totalActive = shelter.getActivePetCount();
        int quarantineCount = shelter.getPetsInQuarantine().size();

        cards.add(makeCard("Animals in Shelter",
                String.valueOf(totalActive),
                new Color(52, 152, 219)));

        cards.add(makeCard("Newest Arrival",
                newest != null ? newest.getName() + " (" + newest.getSpecies() + ")" : "None",
                new Color(46, 204, 113)));

        cards.add(makeCard("Last Adopted",
                lastAdoption != null ? lastAdoption.getPet().getName() : "None",
                new Color(155, 89, 182)));

        cards.add(makeCard("In Quarantine",
                String.valueOf(quarantineCount),
                new Color(231, 76, 60)));

        add(cards, BorderLayout.CENTER);
    }

    private JPanel makeCard(String label, String value, Color color) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(color);
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        card.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        JLabel valueLabel = new JLabel(value, SwingConstants.CENTER);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 28));
        valueLabel.setForeground(Color.WHITE);

        JLabel nameLabel = new JLabel(label, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        nameLabel.setForeground(new Color(255, 255, 255, 200));

        card.add(valueLabel, BorderLayout.CENTER);
        card.add(nameLabel, BorderLayout.SOUTH);
        return card;
    }
}