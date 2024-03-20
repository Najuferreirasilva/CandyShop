import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CandyShop extends JFrame implements ActionListener {
    JTextField quantityField;
    JLabel totalLabel;

    public CandyShop() {
        setTitle("Candy Shop");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel quantityLabel = new JLabel("Quantidade:");
        panel.add(quantityLabel);

        quantityField = new JTextField();
        panel.add(quantityField);

        JLabel emptyLabel = new JLabel(""); // Para preencher o espaço vazio
        panel.add(emptyLabel);

        JButton orderButton = new JButton("Pedir");
        orderButton.addActionListener(this);
        panel.add(orderButton);

        JLabel totalTextLabel = new JLabel("Total:");
        panel.add(totalTextLabel);

        totalLabel = new JLabel("");
        panel.add(totalLabel);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int quantity = Integer.parseInt(quantityField.getText());
            double pricePerCandy = 1.50; // Preço por doce
            double total = quantity * pricePerCandy;
            totalLabel.setText("R$" + total);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma quantidade válida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CandyShop();
    }
}
